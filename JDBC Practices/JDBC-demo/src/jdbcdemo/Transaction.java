package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connect to db-- use class DriveManager and method getconnection(dburl,username,pwd)
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		
		//Run query
		String q1 = "insert into movies values('Mr Bean', 'comedy','director1','2001')";
		String q2 = "update movies set director='Mack' where title='Inside Out'";
		String q3 = "delete from movies where title='Mr Bean'";
		boolean flag=true;
		
		
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch(q1);
		st.addBatch(q2);
		st.addBatch(q3);
		
		
		//if all queris executed returns true,else false
		int [] result = st.executeBatch();
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		
			if (result[i]==0) {
				flag=false;
				break;
			}
		}	
		
		if(flag==true)
		{
			con.commit();
			System.out.println("Transaction successfull");
		}
		
		else {
			con.rollback();
			System.out.println("Transaction unsuccessfull");
		}	
}

	
}	
	
	
	
	
	