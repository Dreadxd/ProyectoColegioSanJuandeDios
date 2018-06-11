package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidad.BeanAlumno;
import modelo.entidad.BeanCursoLlenado;
import modelo.entidad.BeanMatricula;
import utilitarios.Conexion;

public class DAOGestionarMatricula extends Conexion {
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public DAOGestionarMatricula() {
		super();
	}
	//registrar matricula de alumno
	public boolean registrarMatricula(BeanMatricula matri) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO matricula (idmatricula,dnialumno,idnivel,idgrado,idseccion,fechamatri,horamatri,estado,idtaller) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, matri.getIdMatri());
            ps.setString(2, matri.getDniAlu());
            ps.setString(3, matri.getIdNivel());
            ps.setString(4, matri.getIdGrado());
            ps.setString(5, matri.getIdSeccion());
            ps.setDate(6, matri.getFechaMatri());
            ps.setDate(7, matri.getHoraMatri());
            ps.setString(8, matri.getEstado());
            ps.setString(9, matri.getIdTaller());
            ps.execute();
            
            con.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return false;
    }
	// listar todas las matriculas
		public ArrayList<BeanMatricula> listarMatriculas() throws SQLException {
	 
			ArrayList<BeanMatricula> listaMatriculas = new ArrayList<BeanMatricula>();
			PreparedStatement ps = null;
	        Connection con = getConexion();
			String sql = "SELECT * FROM matricula where estado=1";
			rs=st.executeQuery(sql);
			ps = con.prepareStatement(sql);
	 
			while (rs.next()) {
				String idmatricula = rs.getString("idmatricula");
				String dnialumno = rs.getString("dnialumno");
				String idnivel = rs.getString("idnivel");
				String idgrado = rs.getString("idgrado");
				String idseccion = rs.getString("idseccion");
				Date fechamatri = rs.getDate("fechamatri");
				Date horamatri = rs.getDate("horamatri");
				String idtaller = rs.getString("idtaller");
				BeanMatricula matricula = new BeanMatricula(idmatricula,dnialumno,idnivel,idgrado,idseccion,fechamatri,horamatri,idtaller);
				listaMatriculas.add(matricula);
			}
			
			return listaMatriculas;
		}
	
	//
	public ResultSet buscarAlumno(String dniAlu){
		BeanAlumno alu=null;
		try {
			conn=this.getConexion();
			st=conn.createStatement();
			rs=st.executeQuery("select c.dnialumno, c.nomalumno, c.apealumno, b.nombre from alumno c join apoderado b on c.idpadre=b.idpadre where dnialumno='"+dniAlu+"';");
			/*if(rs.next()){
				String dni=rs.getString("dnialumno");
				String nomAlu=rs.getString("nomalumno");
				String apeAlu=rs.getString("apealumno");
				String nomApo=rs.getString("nombre");
				
				 alu=new BeanAlumno(dni,nomAlu,apeAlu,nomApo);
				 
				return alu;
			}*/
			//this.cerrarConexion();
			return rs;
		    
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			this.cerrarConexion();
		}
		return null; 
	}
	
	public boolean eliminar(String matri) {
                
        try {
        	conn=this.getConexion();
    		st=conn.createStatement();
            rs=st.executeQuery("update estado=0 FROM producto WHERE idmatricula='"+matri+"'");
            return true;            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
        	this.cerrarConexion();
        }
        
    }
	
}
