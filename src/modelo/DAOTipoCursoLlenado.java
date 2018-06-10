package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidad.BeanNivelLlenado;
import modelo.entidad.BeanTipoCursoLlenado;
import utilitarios.Conexion;

public class DAOTipoCursoLlenado extends Conexion{
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public DAOTipoCursoLlenado() {
		super();
	}
	public ArrayList<BeanTipoCursoLlenado> consultarTipoCurso(){
		ArrayList<BeanTipoCursoLlenado> tipoCursos=new ArrayList<BeanTipoCursoLlenado>();
		try {
			conn=this.getConexion();
			st=conn.createStatement();
			rs=st.executeQuery("select idtipcurso,tipocurso from tipo_curso;");
			ResultSetMetaData md = rs.getMetaData();
		    
			while (rs.next()) {
				String id=rs.getString("idtipcurso");
				String tipocurso=rs.getString("tipocurso");
				BeanTipoCursoLlenado n=new  BeanTipoCursoLlenado(id, tipocurso);
				tipoCursos.add(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			this.cerrarConexion();
		}
		return tipoCursos; 
	}
}
