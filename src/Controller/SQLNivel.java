package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Nivel;

public class SQLNivel {
        private static String SELECT_ALL = "SELECT * FROM NIVEL ";
	private static String SELECT_ONE = "SELECT * FROM NIVEL where nivel_id = ? ";
	private static String SELECT_ID = "SELECT nivel_id FROM NIVEL WHERE NIVEL = ? ";
	private static String DELETE = "DELETE FROM NIVEL  WHERE NIVEL = ? ";
	private static String UPDATE = "UPDATE NIVEL SET NIVEL = ? WHERE nivel_id = ? ";
	private static String INSERT = "INSERT INTO NIVEL(NIVEL) VALUES ( ? )";

	public List<Nivel> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Nivel nivel= null;
		List<Nivel> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				nivel=new Nivel(rs.getInt(1),rs.getString(2));
				lista.add(nivel);
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
        	public List<Nivel> querySelectOne() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Nivel nivel= null;
		List<Nivel> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ONE);
			rs = stmt.executeQuery();
			if(rs.next()) {
				nivel=new Nivel(rs.getInt(1),rs.getString(2));
				lista.add(nivel);
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
	public List<Nivel> querySelectId() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Nivel nivel= null;
		List<Nivel> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ID);
			rs = stmt.executeQuery();
			if(rs.next()) {
				nivel=new Nivel(rs.getInt(1),rs.getString(2));
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
	public int queryInsert(Nivel nivel) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setString(1, nivel.getNivel());
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
	public int queryUpdate(Nivel nivel) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, nivel.getNivel());
                        stmt.setInt(2, nivel.getNivel_id());
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
