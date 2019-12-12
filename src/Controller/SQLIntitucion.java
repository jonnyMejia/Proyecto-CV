package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Institucion;

public class SQLIntitucion {
	private static String SELECT_ALL = "SELECT * FROM INSTITUCION ";
	private static String SELECT_ID = "SELECT inst_id FROM INSTITUCION WHERE nombre = ? ";
	private static String SELECT_ONE = "SELECT * FROM INSTITUCION WHERE inst_id= ? ";
	private static String DELETE = "DELETE FROM INSTITUCION WHERE inst_id = ? ";
	private static String INSERT = "INSERT INTO INSTITUCION(NOMBRE) VALUES ( ? )";
	private static String UPDATE = "UPDATE INSTITUCION SET nombre = ? WHERE inst_id = ? ";
	
	public List<Institucion> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Institucion inst= null;
		List<Institucion> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				inst=new Institucion(rs.getInt(1),rs.getString(2));
				lista.add(inst);
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
	public Institucion querySelectOne(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Institucion inst= null;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ONE);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if(rs.next()) {
				inst=new Institucion(rs.getInt(1),rs.getString(2));
			}
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return inst;
	}
	public int queryInsert(String nombre) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setString(1, nombre);
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
	public int queryUpdate(Institucion inst) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, inst.getNombre());
			stmt.setInt(2, inst.getInst_id());
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
