package modelo.entidad;

public class BeanNivelLlenado {
	private String idNivel;
	private String nivel;
	private String estado;
	
	public BeanNivelLlenado(String idNivel, String nivel, String estado) {
		super();
		this.idNivel = idNivel;
		this.nivel = nivel;
		this.estado = estado;
	}

	public String getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(String idNivel) {
		this.idNivel = idNivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
