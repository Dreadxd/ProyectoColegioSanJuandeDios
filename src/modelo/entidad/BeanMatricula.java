package modelo.entidad;

import java.sql.Date;

public class BeanMatricula {
	private String idMatri;
	private String dniAlu;
	private String idNivel;
	private String idGrado;
	private String idSeccion;
	private Date fechaMatri;
	private Date horaMatri;
	private String idTaller;
	private String estado;
	public BeanMatricula(String idMatri, String dniAlu, String idNivel, String idGrado, String idSeccion,
			Date fechaMatri, Date horaMatri, String idTaller, String estado) {
		super();
		this.idMatri = idMatri;
		this.dniAlu = dniAlu;
		this.idNivel = idNivel;
		this.idGrado = idGrado;
		this.idSeccion = idSeccion;
		this.fechaMatri = fechaMatri;
		this.horaMatri = horaMatri;
		this.idTaller = idTaller;
		this.estado = estado;
	}
	
	public BeanMatricula(String idMatri, String dniAlu, String idNivel, String idGrado, String idSeccion,
			Date fechaMatri, Date horaMatri, String idTaller) {
		super();
		this.idMatri = idMatri;
		this.dniAlu = dniAlu;
		this.idNivel = idNivel;
		this.idGrado = idGrado;
		this.idSeccion = idSeccion;
		this.fechaMatri = fechaMatri;
		this.horaMatri = horaMatri;
		this.idTaller = idTaller;
	}

	public String getIdMatri() {
		return idMatri;
	}
	public void setIdMatri(String idMatri) {
		this.idMatri = idMatri;
	}
	public String getDniAlu() {
		return dniAlu;
	}
	public void setDniAlu(String dniAlu) {
		this.dniAlu = dniAlu;
	}
	public String getIdNivel() {
		return idNivel;
	}
	public void setIdNivel(String idNivel) {
		this.idNivel = idNivel;
	}
	public String getIdGrado() {
		return idGrado;
	}
	public void setIdGrado(String idGrado) {
		this.idGrado = idGrado;
	}
	public String getIdSeccion() {
		return idSeccion;
	}
	public void setIdSeccion(String idSeccion) {
		this.idSeccion = idSeccion;
	}
	public Date getFechaMatri() {
		return fechaMatri;
	}
	public void setFechaMatri(Date fechaMatri) {
		this.fechaMatri = fechaMatri;
	}
	public Date getHoraMatri() {
		return horaMatri;
	}
	public void setHoraMatri(Date horaMatri) {
		this.horaMatri = horaMatri;
	}
	public String getIdTaller() {
		return idTaller;
	}
	public void setIdTaller(String idTaller) {
		this.idTaller = idTaller;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
