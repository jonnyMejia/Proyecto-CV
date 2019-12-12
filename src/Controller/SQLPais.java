package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Pais;

public class SQLPais {
        private static String SELECT_ALL = "SELECT * FROM PAIS ";
	private static String SELECT_ONE = "SELECT * FROM PAIS where pais_id = ? ";
	private static String SELECT_ID = "SELECT pais_id FROM PAIS WHERE NOMBRE = ? ";
	private static String DELETE = "DELETE FROM PAIS  WHERE NOMBRE = ? ";
	private static String UPDATE = "UPDATE PAIS SET PAIS = ? WHERE pais_id = ? ";
	private static String INSERT = "INSERT INTO PAIS(NOMBRE) VALUES ( ? )";

          public List<Pais> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Pais pais= null;
		List<Pais> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				pais=new Pais(rs.getInt(1),rs.getString(2));
				lista.add(pais);
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
            public List<Pais> querySelectOne() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Pais pais= null;
		List<Pais> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ONE);
			rs = stmt.executeQuery();
			if(rs.next()) {
				pais=new Pais(rs.getInt(1),rs.getString(2));
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
	public List<Pais> querySelectId() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Pais pais= null;
		List<Pais> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ID);
			rs = stmt.executeQuery();
			if(rs.next()) {
				pais=new Pais(rs.getInt(1),rs.getString(2));
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
	public int queryInsert(Pais pais) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setString(1, pais.getNombre());
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
	public int queryUpdate(Pais pais) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, pais.getNombre());
                        stmt.setInt(2, pais.getPais_id());
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
