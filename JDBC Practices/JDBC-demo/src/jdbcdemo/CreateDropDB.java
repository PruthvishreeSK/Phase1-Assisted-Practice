package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDropDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/animated_movies", "root", "root");
		
		String query1 = "create database demodb";
		String query2 = "use demodb";
		String query3 = "drop database demodb";
		
		Statement st = con.createStatement();
		
		st.executeUpdate(query1);
		System.out.println("Database created");
		
		st.executeUpdate(query2);
		System.out.println("Database in use");
		
		st.executeUpdate(query3);
		System.out.println("Database deleted");
		
		

	}

}
