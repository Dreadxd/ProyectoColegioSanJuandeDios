package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidad.BeanNivelLlenado;
import modelo.entidad.BeanSeccionLlenado;
import utilitarios.Conexion;

public class DAOSeccionLlenado extends Conexion{
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public DAOSeccionLlenado() {
		super();
	}
	public ArrayList<BeanSeccionLlenado> consultarSeccion(){
		ArrayList<BeanSeccionLlenado> niveles=new ArrayList<BeanSeccionLlenado>();
		try {
			conn=this.getConexion();
			st=conn.createStatement();
			rs=st.executeQuery("select idseccion,seccion from seccion;");
			ResultSetMetaData md = rs.getMetaData();
		    int columns = md.getColumnCount();
		    
			while (rs.next()) {
				String id=rs.getString("idseccion");
				String seccion=rs.getString("seccion");
				BeanSeccionLlenado n=new  BeanSeccionLlenado(id, seccion);
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
