package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOGestionarCargaCurricular;
import modelo.DAOUsuario;

/**
 * Servlet implementation class ServletGestionarCargaCurricular
 */
@WebServlet("/ServletGestionarCargaCurricular")
public class ServletGestionarCargaCurricular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGestionarCargaCurricular() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String nivel=request.getParameter("selNivel");
        String grado=request.getParameter("selGrado");
        String seccion=request.getParameter("selSeccion");
        String tipoCurso=request.getParameter("selTipoCurso");
        String curso=request.getParameter("selCurso");
        String docente=request.getParameter("selDocente");

        DAOGestionarCargaCurricular carga=new DAOGestionarCargaCurricular();
        
        carga.insertar(nivel, grado, seccion, tipoCurso, curso, docente);
		
	}

}
