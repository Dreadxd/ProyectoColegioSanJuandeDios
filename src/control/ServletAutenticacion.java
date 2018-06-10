package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOUsuario;

/**
 * Servlet implementation class ServletAutenticacion
 */
@WebServlet("/ServletAutenticacion")
public class ServletAutenticacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAutenticacion() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        String usuario=request.getParameter("txtUser");
        String clave=request.getParameter("txtPass");

        DAOUsuario user=new DAOUsuario();
        
        if(user.validar(usuario, clave)){
        	request.getRequestDispatcher("MenuOption.jsp").forward(request, response);
        }else{
        	request.setAttribute("error", "<script>alert('USUARIO Y/O CONTRASEÑA NO SON VALIDOS')</script>");
        	request.getRequestDispatcher("index.jsp").forward(request, response);        	
        }
        
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getSession().invalidate();
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String usuario=request.getParameter("txtUser");
        String clave=request.getParameter("txtPass");

        DAOUsuario user=new DAOUsuario();
        if(user.validar(usuario, clave)){
        	request.getRequestDispatcher("MenuOption.jsp").forward(request, response);
        }else{
        	request.setAttribute("error", "<script>alert('USUARIO Y/O CONTRASEÑA NO VALIDOS')</script>");
        	request.getRequestDispatcher("index.jsp").forward(request, response);        	
        }
	}

}
