package modelo.entidad;

public class BeanSeccionLlenado {
	private String idSecci;
	private String seccion;
	private String estado;
	public BeanSeccionLlenado(String idSecci, String seccion, String estado) {
		super();
		this.idSecci = idSecci;
		this.seccion = seccion;
		this.estado = estado;
	}
	
	public BeanSeccionLlenado(String idSecci, String seccion) {
		super();
		this.idSecci = idSecci;
		this.seccion = seccion;
	}

	public String getIdSecci() {
		return idSecci;
	}
	public void setIdSecci(String idSecci) {
		this.idSecci = idSecci;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
