package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Area_Laboral;
import Entidades.Postulante;

public class SQLPostulante {
	private static String SELECT_ALL = "SELECT * FROM POSTULANTE";
	private static String SELECT_ID = "SELECT dni_id FROM POSTULANTE WHERE nombre = ? ";
	private static String SELECT_ONE = "SELECT * FROM POSTULANTE WHERE dni_id= ? ";
	private static String DELETE = "DELETE FROM POSTULANTE WHERE dni_id = ? ";
	private static String INSERT = "INSERT INTO postulante VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )";
	private static String UPDATE = "UPDATE postulante SET dni_id = ? "
			+ ", nombre = ? "
			+ ", ap_pat = ? "
			+ ", ap_mat = ? "
			+ ", domicilio = ? "
			+ ", edad = ? "
			+ ", fnac = ? "
			+ ", pais_id = ? "
			+ ", genero = ? "
			+ ", estado_id = ? "
			+ ", email = ? "
			+ ", pensiones_id = ? "
			+ ", lug_id = ? "
			+ ", area_lab_id = ? "
			+ " WHERE dni_id = ? ";
	
	public int querySelectId(String nombre) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int id=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ID);
			stmt.setString(1, nombre);
			rs = stmt.executeQuery();
			if(rs.next()) {
				id=rs.getInt(1);
			}
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return id;
	}
	public Postulante querySelectOne(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Postulante pos= null;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ONE);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if(rs.next()) {
				pos=new Postulante(rs.getString(1),rs.getString(2)
						,rs.getString(3),rs.getString(4)
						,rs.getString(5),rs.getInt(6)
						,rs.getString(7),rs.getInt(8)
						,rs.getString(9),rs.getInt(10)
						,rs.getString(11),rs.getInt(12)
						,rs.getInt(13),rs.getInt(14)
						);
			}
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return pos;
	}
	
	public List<Postulante> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Postulante areaLab= null;
		List<Postulante> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				areaLab=new Postulante(rs.getString(1),rs.getString(2)
						,rs.getString(3),rs.getString(4)
						,rs.getString(5),rs.getInt(6)
						,rs.getString(7),rs.getInt(8)
						,rs.getString(9),rs.getInt(10)
						,rs.getString(11),rs.getInt(12)
						,rs.getInt(13),rs.getInt(14)
						);
				lista.add(areaLab);
			}
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return lista;
	}
	public int queryInsert(Postulante pos) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setString(1, pos.getDNI());
			stmt.setString(2, pos.getNombre());
			stmt.setString(3, pos.getAp_pat());
			stmt.setString(4, pos.getAp_mat());
			stmt.setString(5, pos.getDomiciilio());
			stmt.setInt(6, pos.getEdad());
			stmt.setString(7, pos.getfNac());
			stmt.setInt(8, pos.getPais_id());
			stmt.setString(9, pos.getGenero());
			stmt.setInt(10, pos.getEstado_id());
			stmt.setString(11, pos.getEmail());
			stmt.setInt(12, pos.getPensiones_id());
			stmt.setInt(13, pos.getLugar_id());
			stmt.setInt(14, pos.getArea_id());
			
			rows = stmt.executeUpdate();	
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return rows;
	}
	public int queryDelete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(DELETE);
			stmt.setString(1, id);
			rows = stmt.executeUpdate();	
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return rows;
	}
	public int queryUpdate(Postulante pos) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, pos.getDNI());
			stmt.setString(2, pos.getNombre());
			stmt.setString(3, pos.getAp_pat());
			stmt.setString(4, pos.getAp_mat());
			stmt.setString(5, pos.getDomiciilio());
			stmt.setInt(6, pos.getEdad());
			stmt.setString(7, pos.getfNac());
			stmt.setInt(8, pos.getPais_id());
			stmt.setString(9, pos.getGenero());
			stmt.setInt(10, pos.getEstado_id());
			stmt.setString(11, pos.getEmail());
			stmt.setInt(12, pos.getPensiones_id());
			stmt.setInt(13, pos.getLugar_id());
			stmt.setInt(14, pos.getArea_id());
			stmt.setString(15, pos.getDNI());
			
			rows = stmt.executeUpdate();	
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return rows;
	}
	
	
}
