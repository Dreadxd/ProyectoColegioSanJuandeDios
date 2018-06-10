package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Conexion {
	private Connection con = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost/sage", "root","");
			System.out.println("Conexion a Base de Datos: status ok!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al tratar de abrir la base de datos"+e);
		}
	}
	
	public Connection getConexion(){
		return con;
	}
	
	public ResultSet getDatos(String com) {
	    try {
	    	getConexion();
	      rs = pstm.executeQuery(com);
	    } catch (Exception e) {
	      JOptionPane.showMessageDialog(null, "Error: " + e);
	    }
	    return rs;
	  }
	
	public void cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
