package DBManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	
	public static Connection getConnection() throws SQLException  {
		return DriverManager.getConnection(Config.URL, Config.USER, Config.PASS);
	}
	public static void closePrepared(PreparedStatement stmt){
		try{
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}
	}
	public static void closeResult(ResultSet rs) {
		try{
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}
	}
	public static void closeConnection(Connection con)  {
		try{
			con.close();
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}
	}
}
