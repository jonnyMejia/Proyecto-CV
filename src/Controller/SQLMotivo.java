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
    private static String SELECT_ALL = "SELECT * FROM MOTIVO ";
	private static String SELECT_ONE = "SELECT * FROM MOTIVO where motivo_id = ? ";
	private static String SELECT_ID = "SELECT motivo_id FROM MOTIVO WHERE MOTIVO = ? ";
	private static String DELETE = "DELETE FROM MOTIVO  WHERE MOTIVO = ? ";
	private static String UPDATE = "UPDATE MOTIVO SET MOTIVO = ? WHERE motivo_id = ? ";
	private static String INSERT = "INSERT INTO MOTIVO(MOTIVO) VALUES ( ? )";
        
     	 public List<Motivo> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Motivo motivo= null;
		List<Motivo> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				motivo=new Motivo(rs.getInt(1),rs.getString(2));
				lista.add(motivo);
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

        public Motivo querySelectOne(int id) {

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Motivo motivo= null;
		try {
			con=DBManager.getConnection();  
			stmt=con.prepareStatement(SELECT_ONE);
                        stmt.setInt(1, id);
                        rs = stmt.executeQuery();

			if(rs.next()) {
				motivo=new Motivo(rs.getInt(1),rs.getString(2));				
			}
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return motivo;
	}
                
	public int  querySelectId(String motivo) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		int id=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ID);
                        stmt.setString(1, motivo);
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
	public int queryInsert(String  motivo) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setString(1, motivo);
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
