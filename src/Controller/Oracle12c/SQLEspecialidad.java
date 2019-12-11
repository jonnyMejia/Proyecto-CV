package Controller.Oracle12c;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Especialidad;

public class SQLEspecialidad {
	private static String SELECT = "SELECT * FROM ESPECIALIDAD ";
	private static String DELETE = "DELETE FROM ESPECIALIDAD WHERE area_id = ? ";
	private static String INSERT = "INSERT INTO ESPECIALIDAD VALUES ( ? , ? )";
	private static String UPDATE = "UPDATE ESPECIALIDAD SET nombre = ? WHERE area_id = ? ";

	public List<Especialidad> querySelect() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Especialidad esp = null;
		List<Especialidad> lista = new ArrayList<>();
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(SELECT);
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

	public int queryInsert(Especialidad esp) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			con = DBManager.getConnection();
			stmt = con.prepareStatement(INSERT);
			stmt.setInt(1, esp.getEspec_id());
			stmt.setString(2, esp.getNombre());
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
