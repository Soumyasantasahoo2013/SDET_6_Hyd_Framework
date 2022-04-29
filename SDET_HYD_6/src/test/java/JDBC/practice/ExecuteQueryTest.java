package JDBC.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQueryTest {
	
	@Test
	public void executeQueryTest() throws Throwable
	{
		//Step=2 Connect to Database
		Connection con=null;
		try {
			//Step=1 Register the Driver
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
			//Step=3 Create a Statement
			Statement stmt = con.createStatement();
			
			//Step=4 Execute the query
			ResultSet result = stmt.executeQuery("select * from students_info;");
			while(result.next())
			{
				System.out.println(result.getString(1)+" "+result.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
		//Step=5 Close connection
		con.close();
		}
	}

}
