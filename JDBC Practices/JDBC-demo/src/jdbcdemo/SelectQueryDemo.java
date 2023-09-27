package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//Load  DB driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connect to db-- use class DriveManager and method getconnection(dburl,username,pwd)
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		
		//Run query
		
		String query = "select * from movies where title='Inside'";
		
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
	
		/*System.out.println("Title \t\t Genre \t Director \tRelease year");
		System.out.println("_____________________________________________________________");
		
		while(rs.next())
		{
			System.out.println(rs.getString("title")+"\t" +rs.getString("genre")+"\t"+ rs.getString("director") + "\t" + rs.getString("release_year"));
		}*/
	con.close();
	 
	}

}
