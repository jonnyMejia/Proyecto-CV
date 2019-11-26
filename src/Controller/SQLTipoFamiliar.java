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
	private static String SELECT = "SELECT * FROM TIPO_FAMILIAR";
	private static String DELETE = "DELETE FROM TIPO_FAMILIAR WHERE tipo_id = ? ";
	private static String INSERT = "INSERT INTO TIPO_FAMILIAR VALUES ( ? , ? )";
	private static String UPDATE = "UPDATE TIPO_FAMILIAR SET nombre = ? WHERE tipo_id = ? ";
	
	public List<Tipo_Familiar> querySelect() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Tipo_Familiar familiar= null;
		List<Tipo_Familiar> listaPaises=new ArrayList<>();
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(SELECT);
			rs = stmt.executeQuery();
			while(rs.next()) {
				familiar=new Tipo_Familiar(rs.getInt(1),rs.getString(2));
				listaPaises.add(familiar);
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
	public int queryInsert(Tipo_Familiar familiar) {
		Connection con = null;
		PreparedStatement stmt = null;
		int rows=0;
		try {
			con=DBManager.getConnection();
			stmt=con.prepareStatement(INSERT);
			stmt.setInt(1, familiar.getTipo_id());
			stmt.setString(2, familiar.getNombre());
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
