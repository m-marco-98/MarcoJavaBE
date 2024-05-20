package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	 
	private final String URL = "jdbc:mysql://localhost:3306/javadb";
	private final String USER = "app_goal";
	private final String PASS = "goal_2024";
	
	private Connection conn = null; //lazy

	public Connection getConn() {
		if (conn == null)
			connetti();
		
		return conn;
	}
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Sei connesso");
		} catch (SQLException e) {
			System.err.printf("Si è verificata un'eccezione SQL %s", e.getMessage());
			
		}
	}
	

}
