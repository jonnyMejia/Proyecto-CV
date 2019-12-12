package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBManager.DBManager;
import Entidades.Tipo_Familiar;

public class SQLTipoFamiliar {
         
	private static String SELECT_ALL = "SELECT * FROM TIPO_FAMILIAR"; 
	private static String SELECT_ONE = "SELECT * FROM TIPO_FAMILIAR WHERE tipo_id = ? ";
	private static String DELETE = "DELETE FROM TIPO_FAMILIAR WHERE tipo_id = ? ";
	private static String INSERT = "INSERT INTO TIPO_FAMILIAR(NOMBRE)  VALUES( ? )";
	private static String UPDATE = "UPDATE TIPO_FAMILIAR SET nombre = ? WHERE tipo_id = ? ";
	private static String SELECT_ID= "SELECT * FROM TIPO_FAMILIAR WHERE nombre =  ? ";
	
	public int querySelect_id(String nombre) {
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			int id=0;
			try {
				con=DBManager.getConnection();
				stmt=con.prepareStatement(SELECT_ID);
				stmt.setString(1, nombre);
				rs = stmt.executeQuery();
				if (rs.next()) { //Para leer varias posibles filas se cambia el while por el if
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
	public Tipo_Familiar querySelect_one(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Tipo_Familiar familiar= null;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ONE);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if (rs.next()) { 
				familiar=new Tipo_Familiar(rs.getInt(1),rs.getString(2));
	        }
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closeResult(rs);
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return familiar;
	}
	
	public List<Tipo_Familiar> querySelectAll() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Tipo_Familiar familiar= null;
		List<Tipo_Familiar> lista=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT_ALL);
			rs = stmt.executeQuery();
			while(rs.next()) {
				familiar=new Tipo_Familiar(rs.getInt(1),rs.getString(2));
				lista.add(familiar);
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
	public int queryInsert(String familiar) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setString(1, familiar);
			rows = stmt.executeUpdate();	
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return rows;
	}
	public int queryDelete(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(DELETE);
			stmt.setInt(1, id);
			rows = stmt.executeUpdate();	
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}finally {
			DBManager.closePrepared(stmt);
			DBManager.closeConnection(con);
		}
		return rows;
	}
	public int queryUpdate(Tipo_Familiar familiar) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			
			con=DBManager.getConnection();
			stmt=con.prepareStatement(UPDATE);
			stmt.setString(1, familiar.getNombre());
			stmt.setInt(2, familiar.getTipo_id());
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
