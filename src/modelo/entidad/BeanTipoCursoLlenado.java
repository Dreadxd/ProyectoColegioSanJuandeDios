package modelo.entidad;

public class BeanTipoCursoLlenado {
	private String idTipoCurso;
	private String tipoCurso;
	private String estado;
	public BeanTipoCursoLlenado(String idTipoCurso, String tipoCurso, String estado) {
		super();
		this.idTipoCurso = idTipoCurso;
		this.tipoCurso = tipoCurso;
		this.estado = estado;
	}
	
	
	public BeanTipoCursoLlenado(String idTipoCurso, String tipoCurso) {
		super();
		this.idTipoCurso = idTipoCurso;
		this.tipoCurso = tipoCurso;
	}


	public String getIdTipoCurso() {
		return idTipoCurso;
	}
	public void setIdTipoCurso(String idTipoCurso) {
		this.idTipoCurso = idTipoCurso;
	}
	public String getTipoCurso() {
		return tipoCurso;
	}
	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
