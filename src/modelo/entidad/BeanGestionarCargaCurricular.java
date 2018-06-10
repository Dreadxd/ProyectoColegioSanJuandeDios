package modelo.entidad;

public class BeanGestionarCargaCurricular {
	private String nivel;
	private String grado;
	private String seccion;
	private String tipoCurso;
	private String curso;
	private String docente;
	
	public BeanGestionarCargaCurricular(String nivel, String grado, String seccion, String tipoCurso, String curso,
			String docente) {
		super();
		this.nivel = nivel;
		this.grado = grado;
		this.seccion = seccion;
		this.tipoCurso = tipoCurso;
		this.curso = curso;
		this.docente = docente;
	}
	
	
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getTipoCurso() {
		return tipoCurso;
	}
	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	
	
	
}
