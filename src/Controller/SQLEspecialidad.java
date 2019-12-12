package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Especialidad;

public class SQLEspecialidad {
	private static String SELECT_ALL = "SELECT * FROM ESPECIALIDAD ";
	private static String SELECT_ID = "SELECT espec_id FROM ESPECIALIDAD WHERE nombre = ? ";
	private static String SELECT_ONE = "SELECT * FROM ESPECIALIDAD WHERE espec_id= ? ";
	private static String DELETE = "DELETE FROM ESPECIALIDAD WHERE espec_id = ? ";
	private static String INSERT = "INSERT INTO ESPECIALIDAD(nombre) VALUES ( ? )";
	private static String UPDATE = "UPDATE ESPECIALIDAD SET nombre = ? WHERE espec_id = ? ";

	
	
	public List<Especialidad> querySelect() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Especialidad esp = null;
		List<Especialidad> lista = new ArrayList<>();
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while (rs.next()) {
				esp = new Especialidad(rs.getInt(1), rs.getString(2));
				lista.add(esp);
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return lista;
	}
	public int querySelectID(String nombre) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int id=0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(SELECT_ID);
			stmt.setString(1, nombre);
			rs = stmt.executeQuery();
			if(rs.next()) {
				rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return id;
	}
	
	
	public Especialidad querySelectOne(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Especialidad esp = null;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(SELECT_ONE);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if(rs.next()) {
				esp = new Especialidad(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return esp;
	}

	public int queryInsert(String nombre) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(INSERT);
			stmt.setString(1, nombre);
			rows = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return rows;
	}

	public int queryDelete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(DELETE);
			stmt.setString(1, id);
			rows = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return rows;
	}

	public int queryUpdate(Especialidad esp) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(UPDATE);
			stmt.setString(1, esp.getNombre());
			stmt.setInt(2, esp.getEspec_id());
			rows = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return rows;
	}
}
