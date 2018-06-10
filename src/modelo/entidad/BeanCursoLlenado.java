package modelo.entidad;

public class BeanCursoLlenado {
	private String idCurso;
	private String curso;
	private String descripcion;
	private String direccion;
	private String idTipoCurso;
	private String estado;
	public BeanCursoLlenado(String idCurso, String curso, String descripcion, String direccion, String idTipoCurso,
			String estado) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.idTipoCurso = idTipoCurso;
		this.estado = estado;
	}
	public BeanCursoLlenado(String idCurso, String curso) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
	}
	public String getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getIdTipoCurso() {
		return idTipoCurso;
	}
	public void setIdTipoCurso(String idTipoCurso) {
		this.idTipoCurso = idTipoCurso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
