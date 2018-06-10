package modelo.entidad;

public class BeanAlumno {
	private String dniAlumno;
	private String nomAlumno;
	private String apeAlumno;
	private String fechaNaci;
	private String estado;
	private String dniApo;
	private String nomApo;
	private String direccion;
	private String distrito;
	private String correo;
	private String telefono;
	private String celular;
	
	public BeanAlumno() {
		super();
	}
	public BeanAlumno(String dniAlumno, String nomAlumno, String apeAlumno, String fechaNaci,
			String estado, String dniApo, String nomApo, String direccion, String distrito, String correo,
			String telefono, String celular) {
		super();
		this.dniAlumno = dniAlumno;
		this.nomAlumno = nomAlumno;
		this.apeAlumno = apeAlumno;
		this.fechaNaci = fechaNaci;
		this.estado = estado;
		this.dniApo = dniApo;
		this.nomApo = nomApo;
		this.direccion = direccion;
		this.distrito = distrito;
		this.correo = correo;
		this.telefono = telefono;
		this.celular = celular;
	}
	public BeanAlumno(String dniAlumno, String nomAlumno, String apeAlumno, String nomApo) {
		super();
		this.dniAlumno = dniAlumno;
		this.nomAlumno = nomAlumno;
		this.apeAlumno = apeAlumno;
		this.nomApo = nomApo;
	}
	public String getDniAlumno() {
		return dniAlumno;
	}
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}
	public String getNomAlumno() {
		return nomAlumno;
	}
	public void setNomAlumno(String nomAlumno) {
		this.nomAlumno = nomAlumno;
	}
	public String getPatAlumno() {
		return apeAlumno;
	}
	public void setApeAlumno(String apeAlumno) {
		this.apeAlumno = apeAlumno;
	}
	public String getFechaNaci() {
		return fechaNaci;
	}
	public void setFechaNaci(String fechaNaci) {
		this.fechaNaci = fechaNaci;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDniApo() {
		return dniApo;
	}
	public void setDniApo(String dniApo) {
		this.dniApo = dniApo;
	}
	public String getNomApo() {
		return nomApo;
	}
	public void setNomApo(String nomApo) {
		this.nomApo = nomApo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	
}
