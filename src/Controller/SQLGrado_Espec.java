package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Grado_Espec;

public class SQLGrado_Espec {
	private static String SELECT = "SELECT * FROM GRADO_ESPEC ";
	private static String DELETE = "DELETE FROM GRADO_ESPEC WHERE grado_id = ? ";
	private static String INSERT = "INSERT INTO GRADO_ESPEC VALUES ( ? , ? )";
	private static String UPDATE = "UPDATE GRADO_ESPEC SET nombre = ? WHERE grado_id = ? ";

	public List<Grado_Espec> querySelect() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Grado_Espec grado = null;
		List<Grado_Espec> lista = new ArrayList<>();
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(SELECT);
			rs = stmt.executeQuery();
			while (rs.next()) {
				grado = new Grado_Espec(rs.getInt(1), rs.getString(2));
				lista.add(grado);
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

	public int queryInsert(Grado_Espec grado) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(INSERT);
			stmt.setInt(1, grado.getGrado_id());
			stmt.setString(2, grado.getNombre());
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

	public int queryUpdate(Grado_Espec grado) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(UPDATE);
			stmt.setString(1, grado.getNombre());
			stmt.setInt(2, grado.getGrado_id());
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
