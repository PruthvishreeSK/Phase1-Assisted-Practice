package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandlingProcedure {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connect to db-- use class DriveManager and method getconnection(dburl,username,pwd)
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		con = DriverManager.getConnection(dburl,username,password);
		
		//Run query
		
		String query = "Call SelectAllMovies()";
		
		//Send query to db
		
		Statement stmt = con.createStatement();
		
		//execute the query, fetch the output and store it in an object of type result
		
		ResultSet rs = stmt.executeQuery(query);
		
		//print all the rows to console
		
	while(rs.next())
	{
		System.out.print("Title " + rs.getString("title") + "\t");
		System.out.print("Genre " + rs.getString("genre") + "\t");
		System.out.print("Director " + rs.getString("director") + "\t");
		System.out.println("Release year " + rs.getString("release_year"));
	}
	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally {
			con.close();
		}
	}

}
