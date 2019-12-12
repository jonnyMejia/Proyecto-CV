package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Estado;

public class SQLEstado {
	private static String SELECT_ALL = "SELECT * FROM ESTADO ";
	private static String SELECT_ID = "SELECT estado_id FROM ESTADO WHERE nombre = ? ";
	private static String SELECT_ONE = "SELECT * FROM ESTADO WHERE estado_id= ? ";
	private static String DELETE = "DELETE FROM ESTADO WHERE estado_id = ? ";
	private static String INSERT = "INSERT INTO ESTADO(nombre) VALUES ( ? )";
	private static String UPDATE = "UPDATE ESTADO SET nombre = ? WHERE estado_id = ? ";

	public List<Estado> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Estado est = null;
		List<Estado> lista = new ArrayList<>();
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while (rs.next()) {
				est = new Estado(rs.getInt(1), rs.getString(2));
				lista.add(est);
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
	public int querySelectId(String nombre) {
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
				id=rs.getInt(1);
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
	public Estado querySelectOne(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Estado est = null;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(SELECT_ONE);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if(rs.next()) {
				est = new Estado(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return est;
	}

	public int queryInsert(String est) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(INSERT);
			stmt.setString(2, est);
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

	public int queryUpdate(Estado est) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(UPDATE);
			stmt.setString(1, est.getNombre());
			stmt.setInt(2, est.getEstado_id());
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
