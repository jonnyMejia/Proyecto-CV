package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DBManager.DBManager;
import Entidades.Sector;

public class SQLSector {
        private static String SELECT_ALL = "SELECT * FROM SECTOR  ";
	private static String SELECT_ONE = "SELECT * FROM SECTOR  where sector_id; = ? ";
	private static String SELECT_ID = "SELECT sector_id; FROM SECTOR  WHERE nombre= ? ";
	private static String DELETE = "DELETE FROM SECTOR  WHERE nombre = ? ";
	private static String UPDATE = "UPDATE SECTOR  SET nombre = ? WHERE sector_id; = ? ";
	private static String INSERT = "INSERT INTO SECTOR (nombre) VALUES ( ? )";

        public List<Sector> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Sector sector= null;
		List<Sector> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				sector=new Sector(rs.getInt(1),rs.getString(2));
				lista.add(sector);
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
	public Sector querySelectOne(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Sector sector= null;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ONE);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if(rs.next()) {
				sector=new Sector(rs.getInt(1),rs.getString(2));
			
			}
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return sector;
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
	public int queryInsert(String sector) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setString(1, sector);
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
	public int queryUpdate(Sector sector) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, sector.getNombre());
			stmt.setInt(2, sector.getSector_id());
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
