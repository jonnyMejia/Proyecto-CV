package Controller.Oracle12c;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Estado;

public class SQLEstado {
	private static String SELECT = "SELECT * FROM ESTADO ";
	private static String DELETE = "DELETE FROM ESTADO WHERE estado_id = ? ";
	private static String INSERT = "INSERT INTO ESTADO VALUES ( ? , ? )";
	private static String UPDATE = "UPDATE ESTADO SET nombre = ? WHERE estado_id = ? ";

	public List<Estado> querySelect() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Estado est = null;
		List<Estado> lista = new ArrayList<>();
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(SELECT);
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

	public int queryInsert(Estado est) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(INSERT);
			stmt.setInt(1, est.getEstado_id());
			stmt.setString(2, est.getNombre());
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
