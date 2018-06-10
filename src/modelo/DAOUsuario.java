package modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utilitarios.Conexion;

public class DAOUsuario extends Conexion {
	
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public DAOUsuario() {
		super();
	}
	public boolean validar(String user,String clave){
		boolean encontrado=false;
		try {
			conn=this.getConexion();
			st=conn.createStatement();
			rs=st.executeQuery("select * from usuario_alumno where usuario='"+user+"' and password='"+clave+"';");
			if(rs.next()){
				encontrado=true;
			}
			this.cerrarConexion();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return encontrado; 
	}
	
	
}
