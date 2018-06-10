package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import utilitarios.*;

public class DAOGestionarCargaCurricular extends Conexion {
	
	
	public DAOGestionarCargaCurricular() {
		// TODO Auto-generated constructor stub
	}
	
	  public void insertar(String nivel, String grado, String seccion, String tipoCurso, String curso, String docente)
	  {
	    try
	    {
	      Conexion con = new Conexion();
	      Connection access = con.getConexion();
	      String sql = "insert into malla_curricular values('" + nivel + "','" + grado + "','" + seccion + "','" + tipoCurso + "','" + curso + "','" + docente + "')";
	      PreparedStatement pstm = access.prepareStatement(sql);
	      pstm.executeUpdate();
	      JOptionPane.showMessageDialog(null, "Inserto un nuevo registro satisfactoriamente");
	    }
	    catch (Exception e) {
	      JOptionPane.showMessageDialog(null, "Error al insertar nuevo registro: " + e);
	    }
	  }
	  
	  public void actualizar(String nivel, String grado, String seccion, String tipoCurso, String curso, String docente) {
	    try {
	      Conexion con = new Conexion();
	      Connection access = con.getConexion();
	      String sql = "update malla_curricular set nombre='" + nivel + "',ap_paterno='" + grado + "', ap_materno='" + seccion + "', user='" + tipoCurso + "',pass='" + curso + "' where id_usr= '" + docente + "'";
	      PreparedStatement pstm = access.prepareStatement(sql);
	      pstm.executeUpdate();
	      JOptionPane.showMessageDialog(null, "Actualizacion satisfactoriamente!");
	    }
	    catch (Exception e) {
	      JOptionPane.showMessageDialog(null, "Error al actualizar: " + e);
	    }
	 }
	public ResultSet listar() {
	    Conexion con = new Conexion();
	    String com = "select * from malla_curricular";
	    ResultSet rs = con.getDatos(com);
	    return rs;
	  }
	  
	  public ResultSet mostrar() {
	    Conexion con = new Conexion();
	    String com = "Select IDNIVEL,NIVEL from NIVEL";
	    ResultSet rs = con.getDatos(com);
	    return rs;
	  }
}
