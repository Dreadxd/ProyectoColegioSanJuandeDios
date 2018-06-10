package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modelo.entidad.BeanNivelLlenado;
import utilitarios.Conexion;

public class DAONivelLlenado extends Conexion{
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public DAONivelLlenado() {
		super();
	}
	public ArrayList<BeanNivelLlenado> consultarNivel(){
		ArrayList<BeanNivelLlenado> niveles=new ArrayList<BeanNivelLlenado>();
		try {
			conn=this.getConexion();
			st=conn.createStatement();
			rs=st.executeQuery("select idnivel,nivel,estado from nivel;");
			ResultSetMetaData md = rs.getMetaData();
		    int columns = md.getColumnCount();
		    
			while (rs.next()) {
				String id=rs.getString("idnivel");
				String nivel=rs.getString("nivel");
				String estado=rs.getString("estado");
				BeanNivelLlenado n=new  BeanNivelLlenado(id, nivel, estado);
				niveles.add(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			//this.cerrarConexion();
		}
		return niveles; 
	}
}
