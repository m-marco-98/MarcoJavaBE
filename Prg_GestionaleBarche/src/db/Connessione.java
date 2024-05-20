package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String URL = "jdbc:mysql://localhost:3306/gestione_barche";
	private final String USER = "app_goal";
	private final String PASS = "goal_2024";
	
	private Connection conn;
	
	public Connection getConn() {
		if (conn == null) {
			connetti();
		}		
		return conn;
	}
	
	private void connetti() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("sei connesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("non sei connesso " + e.getMessage());
		}
	}
	
	private void disconnetti() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
