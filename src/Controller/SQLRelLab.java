package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Rel_Lab;

public class SQLRelLab {
        private static String SELECT_ALL = "SELECT * FROM REL_LABORAL ";
	private static String SELECT_ONE = "SELECT * FROM REL_LABORAL where rel_lab_id = ? ";
	private static String SELECT_ID = "SELECT rel_lab_id FROM REL_LABORAL WHERE descripcion = ? ";
	private static String DELETE = "DELETE FROM REL_LABORAL WHERE descripcion  = ? ";
	private static String UPDATE = "UPDATE REL_LABORAL SET descripcion = ? WHERE rel_lab_id = ? ";
	private static String INSERT = "INSERT INTO REL_LABORAL(descripcion) VALUES ( ? )";

	public List<Rel_Lab> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Rel_Lab relLab= null;
		List<Rel_Lab> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				relLab=new Rel_Lab(rs.getInt(1),rs.getString(2));
				lista.add(relLab);
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
        public List<Rel_Lab> querySelectOne() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Rel_Lab relLab= null;
		List<Rel_Lab> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ONE);
			rs = stmt.executeQuery();
			if(rs.next()) {
				relLab=new Rel_Lab(rs.getInt(1),rs.getString(2));
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
	public List<Rel_Lab> querySelectId() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Rel_Lab relLab= null;
		List<Rel_Lab> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ID);
			rs = stmt.executeQuery();
			if(rs.next()) {
				relLab=new Rel_Lab(rs.getInt(1),rs.getString(2));
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
	public int queryInsert(Rel_Lab relLab) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setString(1, relLab.getDescripcion());
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
	public int queryUpdate(Rel_Lab relLab) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, relLab.getDescripcion());
			stmt.setInt(2, relLab.getRel_lab_id());
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
