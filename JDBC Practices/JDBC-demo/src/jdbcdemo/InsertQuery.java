package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/animated_movies", "root", "root");
		
		//Use con.preparestatement("query...")
		
		PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?,?)");
		
		//OR PreparedStatement ps = con.prepareStatement("insert into movies values('Tom and Jerry','kidsfun','Kim','1980')");
		
		//use ps.getString(index,string) to read and executeUpdate() to execute
		
		ps.setString(1, "Tom and Jerry");
		ps.setString(2, "kidsfun");
		ps.setString(3, "Kim");
		ps.setString(4, "1980");
		
		
		ps.executeUpdate();
		
		con.close();
	}

}
