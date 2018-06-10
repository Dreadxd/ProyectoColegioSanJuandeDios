package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOCursoLlenado;
import modelo.DAODocente;
import modelo.DAOGradoLlenado;
import modelo.DAONivelLlenado;
import modelo.DAOSeccionLlenado;
import modelo.DAOTaller;
import modelo.DAOTipoCursoLlenado;
import modelo.entidad.BeanCursoLlenado;
import modelo.entidad.BeanDocente;
import modelo.entidad.BeanGradoLlenado;
import modelo.entidad.BeanNivelLlenado;
import modelo.entidad.BeanSeccionLlenado;
import modelo.entidad.BeanTaller;
import modelo.entidad.BeanTipoCursoLlenado;

/**
 * Servlet implementation class ServletGestionarMatricula
 */
@WebServlet("/ServletGestionarMatricula")
public class ServletGestionarMatricula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGestionarMatricula() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//ArrayList<BeanNivelLlenado> listaNivel= new ArrayList<BeanNivelLlenado>();
		//ArrayList<BeanGradoLlenado> listaGrado= new ArrayList<BeanGradoLlenado>();
		//ArrayList<BeanSeccionLlenado> listaSeccion= new ArrayList<BeanSeccionLlenado>();
		ArrayList<BeanTaller> listaTaller= new ArrayList<BeanTaller>();
		
    	//DAONivelLlenado nivel = new DAONivelLlenado();
    	//DAOGradoLlenado grado = new DAOGradoLlenado();
    	//DAOSeccionLlenado seccion=new DAOSeccionLlenado();
		DAOTaller taller=new DAOTaller();
    	
    	//listaNivel = nivel.consultarNivel();
    	//listaGrado=grado.consultarGrado();
    	//listaSeccion=seccion.consultarSeccion();
		listaTaller=taller.consultarTaller();
    	
    	//request.setAttribute("listaNivel", listaNivel);
    	//request.setAttribute("listaGrado", listaGrado);
    	//request.setAttribute("listaSeccion", listaSeccion);
		request.setAttribute("listaTaller", listaTaller);
    	
    	request.getRequestDispatcher("GestionarMatricula.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*ArrayList<BeanNivelLlenado> listaNivel= new ArrayList<BeanNivelLlenado>();
    	ArrayList<BeanGradoLlenado> listaGrado= new ArrayList<BeanGradoLlenado>();
    	ArrayList<BeanSeccionLlenado> listaSeccion= new ArrayList<BeanSeccionLlenado>();
    	
    	DAONivelLlenado nivel = new DAONivelLlenado();
    	DAOGradoLlenado grado = new DAOGradoLlenado();
    	DAOSeccionLlenado seccion=new DAOSeccionLlenado();
    	
    	listaNivel = nivel.consultarNivel();
    	listaGrado=grado.consultarGrado();
    	listaSeccion=seccion.consultarSeccion();
    	
    	request.setAttribute("listaNivel", listaNivel);
    	request.setAttribute("listaGrado", listaGrado);
    	request.setAttribute("listaSeccion", listaSeccion);
    	
    	request.getRequestDispatcher("GestionarMatricula.jsp");
    	request.getParameter("selNivel2");
    	request.getParameter("selGrado2");
    	request.getParameter("selSeccion2");
		*/
		ArrayList<BeanTaller> listaTaller= new ArrayList<BeanTaller>();
		DAOTaller taller=new DAOTaller();
		listaTaller=taller.consultarTaller();
		request.setAttribute("listaTaller", listaTaller);
		request.getRequestDispatcher("GestionarMatricula.jsp");
		request.getParameter("selTaller");
	}

}
