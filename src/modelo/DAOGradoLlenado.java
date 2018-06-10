package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidad.BeanGradoLlenado;
import utilitarios.Conexion;

public class DAOGradoLlenado extends Conexion{
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public DAOGradoLlenado() {
		super();
	}
	public ArrayList<BeanGradoLlenado> consultarGrado(){
		ArrayList<BeanGradoLlenado> grados=new ArrayList<BeanGradoLlenado>();
		try {
			conn=this.getConexion();
			st=conn.createStatement();
			rs=st.executeQuery("select idgrado,grado from grado;");
			ResultSetMetaData md = rs.getMetaData();
		    
			while (rs.next()) {
				String id=rs.getString("idgrado");
				String grado=rs.getString("grado");
				BeanGradoLlenado n=new  BeanGradoLlenado(id, grado);
				grados.add(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			this.cerrarConexion();
		}
		return grados; 
	}
}
