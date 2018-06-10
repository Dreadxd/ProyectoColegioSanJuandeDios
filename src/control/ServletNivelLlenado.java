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
import modelo.DAOTipoCursoLlenado;
import modelo.DAOUsuario;
import modelo.entidad.BeanCursoLlenado;
import modelo.entidad.BeanDocente;
import modelo.entidad.BeanGradoLlenado;
import modelo.entidad.BeanNivelLlenado;
import modelo.entidad.BeanSeccionLlenado;
import modelo.entidad.BeanTipoCursoLlenado;

/**
 * Servlet implementation class ServletNivelLlenado
 */
@WebServlet("/ServletNivelLlenado")
public class ServletNivelLlenado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNivelLlenado() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
        	ArrayList<BeanNivelLlenado> listaNivel= new ArrayList<BeanNivelLlenado>();
        	DAONivelLlenado nivel = new DAONivelLlenado();
        	listaNivel = nivel.consultarNivel();
        	request.setAttribute("listaNivel", listaNivel);
        	request.getRequestDispatcher("GestionarCarga.jsp");
        }finally{
        	out.close();
        }
        
        
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<BeanNivelLlenado> listaNivel= new ArrayList<BeanNivelLlenado>();
		ArrayList<BeanGradoLlenado> listaGrado= new ArrayList<BeanGradoLlenado>();
		ArrayList<BeanSeccionLlenado> listaSeccion= new ArrayList<BeanSeccionLlenado>();
		ArrayList<BeanTipoCursoLlenado> listaTipoCurso= new ArrayList<BeanTipoCursoLlenado>();
		ArrayList<BeanCursoLlenado> listaCurso= new ArrayList<BeanCursoLlenado>();
		ArrayList<BeanDocente> listaDocentes= new ArrayList<BeanDocente>();
		
    	DAONivelLlenado nivel = new DAONivelLlenado();
    	DAOGradoLlenado grado = new DAOGradoLlenado();
    	DAOSeccionLlenado seccion=new DAOSeccionLlenado();
    	DAOTipoCursoLlenado tipoCurso=new DAOTipoCursoLlenado();
    	DAOCursoLlenado curso=new DAOCursoLlenado();
    	DAODocente docente=new DAODocente();
    	
    	listaNivel = nivel.consultarNivel();
    	listaGrado=grado.consultarGrado();
    	listaSeccion=seccion.consultarSeccion();
    	listaTipoCurso=tipoCurso.consultarTipoCurso();
    	listaCurso=curso.consultarCurso();
    	listaDocentes=docente.consultarDocentes();
    	
    	request.setAttribute("listaNivel", listaNivel);
    	request.setAttribute("listaGrado", listaGrado);
    	request.setAttribute("listaSeccion", listaSeccion);
    	request.setAttribute("listaTipoCurso", listaTipoCurso);
    	request.setAttribute("listaCurso", listaCurso);
    	request.setAttribute("listaDocentes", listaDocentes);
    	
    
    	request.getRequestDispatcher("GestionarCarga.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        	ArrayList<BeanNivelLlenado> listaNivel= new ArrayList<BeanNivelLlenado>();
        	ArrayList<BeanGradoLlenado> listaGrado= new ArrayList<BeanGradoLlenado>();
        	ArrayList<BeanSeccionLlenado> listaSeccion= new ArrayList<BeanSeccionLlenado>();
        	ArrayList<BeanTipoCursoLlenado> listaTipoCurso= new ArrayList<BeanTipoCursoLlenado>();
        	ArrayList<BeanCursoLlenado> listaCurso= new ArrayList<BeanCursoLlenado>();
        	ArrayList<BeanDocente> listaDocentes= new ArrayList<BeanDocente>();
        	
        	DAONivelLlenado nivel = new DAONivelLlenado();
        	DAOGradoLlenado grado = new DAOGradoLlenado();
        	DAOSeccionLlenado seccion=new DAOSeccionLlenado();
        	DAOTipoCursoLlenado tipoCurso=new DAOTipoCursoLlenado();
        	DAOCursoLlenado curso=new DAOCursoLlenado();
        	DAODocente docente=new DAODocente();
        	
        	listaNivel = nivel.consultarNivel();
        	listaGrado=grado.consultarGrado();
        	listaSeccion=seccion.consultarSeccion();
        	listaTipoCurso=tipoCurso.consultarTipoCurso();
        	listaCurso=curso.consultarCurso();
        	listaDocentes=docente.consultarDocentes();
        	
        	request.setAttribute("listaNivel", listaNivel);
        	request.setAttribute("listaGrado", listaGrado);
        	request.setAttribute("listaSeccion", listaSeccion);
        	request.setAttribute("listaTipoCurso", listaTipoCurso);
        	request.setAttribute("listaCurso", listaCurso);
        	request.setAttribute("listaDocentes", listaDocentes);
        	
        	request.getRequestDispatcher("GestionarCarga.jsp");
        	request.getParameter("selNivel");
        	request.getParameter("selGrado");
        	request.getParameter("selSeccion");
        	request.getParameter("selTipoCurso");
        	request.getParameter("selCurso");
        	request.getParameter("selDocente");
        	
	}

}
