package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Area;

public class SQLArea {

	private static String SELECT_ALL = "SELECT * FROM AREA ";
	private static String SELECT_ONE = "SELECT * FROM AREA where area_id = ? ";
	private static String SELECT_ID = "SELECT area_id FROM AREA WHERE NOMBRE = ? ";
	private static String DELETE = "DELETE FROM AREA  WHERE NOMBRE = ? ";
	private static String UPDATE = "UPDATE AREA SET nombre = ? WHERE area_id = ? ";
	private static String INSERT = "INSERT INTO AREA(NOMBRE) VALUES ( ? )";
	
	public Area  querySelect_One(int area_id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Area area= null;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ONE);
			stmt.setInt(1, area_id);
			rs = stmt.executeQuery();
			if(rs.next()) {
				area=new Area(rs.getInt(1),rs.getString(2));
			}
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return area;
	}
	
	public int querySelectId(String nombre) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int area_id=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ID);
			stmt.setString(1, nombre);
			rs = stmt.executeQuery();
			if(rs.next()) {
				area_id=rs.getInt(1);
			}
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return area_id;
	}
	
	
	
	
	
	public List<Area> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Area area= null;
		List<Area> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				area=new Area(rs.getInt(1),rs.getString(2));
				lista.add(area);
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
	
	public int queryInsert(Area area) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setInt(1, area.getArea_id());
			stmt.setString(2, area.getNombre());
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
	public int queryUpdate(Area area) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, area.getNombre());
			stmt.setInt(2, area.getArea_id());
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
