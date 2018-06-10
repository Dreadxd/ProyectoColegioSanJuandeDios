package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidad.BeanTaller;
import utilitarios.Conexion;

public class DAOTaller extends Conexion{
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public DAOTaller() {
		super();
	}
	public ArrayList<BeanTaller> consultarTaller(){
		ArrayList<BeanTaller> talleres=new ArrayList<BeanTaller>();
		try {
			conn=this.getConexion();
			st=conn.createStatement();
			rs=st.executeQuery("select idtaller,taller from taller;");
		    
			while (rs.next()) {
				String id=rs.getString("idtaller");
				String taller=rs.getString("taller");
				BeanTaller n=new  BeanTaller(id, taller);
				talleres.add(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			this.cerrarConexion();
		}
		return talleres; 
	}
}
