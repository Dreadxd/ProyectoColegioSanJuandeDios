package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import utilitarios.Conexion;
import modelo.entidad.BeanCursoLlenado;

public class DAOCursoLlenado extends Conexion{
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public DAOCursoLlenado() {
		super();
	}
	public ArrayList<BeanCursoLlenado> consultarCurso(){
		ArrayList<BeanCursoLlenado> niveles=new ArrayList<BeanCursoLlenado>();
		try {
			conn=this.getConexion();
			st=conn.createStatement();
			rs=st.executeQuery("select idcurso,nomcurso from curso;");
			ResultSetMetaData md = rs.getMetaData();
		    int columns = md.getColumnCount();
		    
			while (rs.next()) {
				String id=rs.getString("idcurso");
				String nivel=rs.getString("nomcurso");
				BeanCursoLlenado n=new  BeanCursoLlenado(id, nivel);
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
