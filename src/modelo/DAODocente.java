package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidad.BeanDocente;
import modelo.entidad.BeanNivelLlenado;
import utilitarios.Conexion;

public class DAODocente extends Conexion {
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public DAODocente() {
		super();
	}
	public ArrayList<BeanDocente> consultarDocentes(){
		ArrayList<BeanDocente> niveles=new ArrayList<BeanDocente>();
		try {
			conn=this.getConexion();
			st=conn.createStatement();
			rs=st.executeQuery("select dnidocente,nomdocente,apedocente from docente;");
			ResultSetMetaData md = rs.getMetaData();
		    
			while (rs.next()) {
				String dni=rs.getString("dnidocente");
				String nom=rs.getString("nomdocente");
				String ape=rs.getString("apedocente");
				BeanDocente n=new  BeanDocente(dni, nom, ape);
				niveles.add(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			this.cerrarConexion();
		}
		return niveles; 
	}
}
