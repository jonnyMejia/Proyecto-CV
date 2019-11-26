package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Motivo;

public class SQLMotivo {
	private static String SELECT = "SELECT * FROM MOTIVO";
	private static String DELETE = "DELETE FROM MOTIVO WHERE motivo_id = ? ";
	private static String INSERT = "INSERT INTO MOTIVO VALUES ( ? , ? )";
	private static String UPDATE = "UPDATE MOTIVO SET motivo = ? WHERE motivo_id = ? ";
	
	public List<Motivo> querySelect() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Motivo motivo= null;
		List<Motivo> listaPaises=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT);
			rs = stmt.executeQuery();
			while(rs.next()) {
				motivo=new Motivo(rs.getInt(1),rs.getString(2));
				listaPaises.add(motivo);
			}
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return listaPaises;
	}
	public int queryInsert(Motivo motivo) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setInt(1, motivo.getMotivo_id());
			stmt.setString(2, motivo.getMotivo());
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
	public int queryUpdate(Motivo motivo) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, motivo.getMotivo());
			stmt.setInt(2, motivo.getMotivo_id());
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
