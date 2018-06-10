package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import utilitarios.Conexion;

public class DAOMantenerAlumno extends Conexion {
	
	public DAOMantenerAlumno() {
		// TODO Auto-generated constructor stub
	}
	
	  public void insertar(String dniAlu, String nomAlu, String apePat, String apeMat, String nomApo, String fecha,String direccion,String distrito,String correo,String telefono,String celular)
	  {
	    try
	    {
	      Conexion con = new Conexion();
	      Connection access = con.getConexion();
	      String sql = "insert into alumno values('" + dniAlu + "','" + nomAlu + "','" + apePat + "','" + apeMat + "','" + nomApo + "','" + fecha + "','" + direccion + "'" + distrito + "','" + correo + "'" + telefono + "'" + celular + "')";
	      PreparedStatement pstm = access.prepareStatement(sql);
	      pstm.executeUpdate();
	      JOptionPane.showMessageDialog(null, "Inserto un nuevo registro satisfactoriamente");
	    }
	    catch (Exception e) {
	      JOptionPane.showMessageDialog(null, "Error al insertar nuevo registro: " + e);
	    }
	  }
	  
	  public void actualizar(String dniAlu, String nomAlu, String apePat, String apeMat, String nomApo, String fecha,String direccion,String distrito,String correo,String telefono,String celular) {
	    try {
	      Conexion con = new Conexion();
	      Connection access = con.getConexion();
	      String sql = "update alumno values('" + dniAlu + "','" + nomAlu + "','" + apePat + "','" + apeMat + "','" + nomApo + "','" + fecha + "','" + direccion + "'" + distrito + "','" + correo + "'" + telefono + "'" + celular + "')";
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
	
	
}
