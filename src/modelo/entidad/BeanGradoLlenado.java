package modelo.entidad;

public class BeanGradoLlenado {
	private String idgrado;
	private String grado;
	private String estado;
	public BeanGradoLlenado(String idgrado, String grado, String estado) {
		super();
		this.idgrado = idgrado;
		this.grado = grado;
		this.estado = estado;
	}
	
	public BeanGradoLlenado(String idgrado, String grado) {
		super();
		this.idgrado = idgrado;
		this.grado = grado;
	}

	public String getIdgrado() {
		return idgrado;
	}
	public void setIdgrado(String idgrado) {
		this.idgrado = idgrado;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
