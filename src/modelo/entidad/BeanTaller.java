package modelo.entidad;

public class BeanTaller {
	private String idTaller;
	private String taller;
	private String material;
	private String costo;
	private String idNivel;
	private String estado;
	public BeanTaller(String idTaller, String taller, String material, String costo, String idNivel, String estado) {
		super();
		this.idTaller = idTaller;
		this.taller = taller;
		this.material = material;
		this.costo = costo;
		this.idNivel = idNivel;
		this.estado = estado;
	}
	public BeanTaller(String idTaller, String taller) {
		super();
		this.idTaller = idTaller;
		this.taller = taller;
	}
	public String getIdTaller() {
		return idTaller;
	}
	public void setIdTaller(String idTaller) {
		this.idTaller = idTaller;
	}
	public String getTaller() {
		return taller;
	}
	public void setTaller(String taller) {
		this.taller = taller;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public String getIdNivel() {
		return idNivel;
	}
	public void setIdNivel(String idNivel) {
		this.idNivel = idNivel;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
