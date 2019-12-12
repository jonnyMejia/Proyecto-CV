package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Pensiones;

public class SQLPensiones {
        private static String SELECT_ALL = "SELECT * FROM PENSIONES ";
	private static String SELECT_ONE = "SELECT * FROM PENSIONES where pais_id = ? ";
	private static String SELECT_ID = "SELECT pensiones_id FROM PENSIONES WHERE NOMBRE = ? ";
	private static String DELETE = "DELETE FROM PENSIONES  WHERE NOMBRE = ? ";
	private static String UPDATE = "UPDATE PAIS SET PENSIONES = ? WHERE pensiones_id = ? ";
	private static String INSERT = "INSERT INTO PENSIONES(NOMBRE) VALUES ( ? )";
	private static String SELECT = "SELECT * FROM PENSIONES ";
        
	public List<Pensiones> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Pensiones pen= null;
		List<Pensiones> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				pen=new Pensiones(rs.getInt(1),rs.getString(2));
				lista.add(pen);
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
	public List<Pensiones> querySelectOne() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Pensiones pen= null;
		List<Pensiones> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ONE);
			rs = stmt.executeQuery();
			if(rs.next()) {
				pen=new Pensiones(rs.getInt(1),rs.getString(2));
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
	public List<Pensiones> querySelectId() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Pensiones pen= null;
		List<Pensiones> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT);
			rs = stmt.executeQuery();
			if(rs.next()) {
				pen=new Pensiones(rs.getInt(1),rs.getString(2));
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
	public int queryInsert(Pensiones pen) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setString(1, pen.getNombre());
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
	public int queryUpdate(Pensiones pen) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, pen.getNombre());
                        stmt.setInt(2, pen.getPensiones_id());
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
