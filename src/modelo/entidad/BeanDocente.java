package modelo.entidad;

import java.sql.Date;

public class BeanDocente {
	private String dniDocente;
	private int cppe;
	private String nomDoc;
	private String apeDoc;
	private String direccion;
	private Date fecha;
	private String idNivel;
	private String estado;
	
	public BeanDocente(String dniDocente, String nomDoc, String apeDoc) {
		super();
		this.dniDocente = dniDocente;
		this.nomDoc = nomDoc;
		this.apeDoc = apeDoc;
	}
	public BeanDocente(String dniDocente, int cppe, String nomDoc, String apeDoc, String direccion, Date fecha,
			String idNivel, String estado) {
		super();
		this.dniDocente = dniDocente;
		this.cppe = cppe;
		this.nomDoc = nomDoc;
		this.apeDoc = apeDoc;
		this.direccion = direccion;
		this.fecha = fecha;
		this.idNivel = idNivel;
		this.estado = estado;
	}
	public String getDniDocente() {
		return dniDocente;
	}
	public void setDniDocente(String dniDocente) {
		this.dniDocente = dniDocente;
	}
	public String getNomDoc() {
		return nomDoc;
	}
	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}
	public String getApeDoc() {
		return apeDoc;
	}
	public void setApeDoc(String apeDoc) {
		this.apeDoc = apeDoc;
	}
	public int getCppe() {
		return cppe;
	}
	public void setCppe(int cppe) {
		this.cppe = cppe;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
