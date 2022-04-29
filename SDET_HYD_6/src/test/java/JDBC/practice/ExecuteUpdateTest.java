package JDBC.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest {
	
	@Test
	public void executeUpdateTest() throws Throwable
	{
		Connection con=null;
		try {
			//Step=1 Register the Driver
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
			//Step=3 Create a Statement
			Statement stmt = con.createStatement();
			
			//Step=4 Execute Non Select Query
			int result = stmt.executeUpdate("insert into students_info (regno, firstname, middlename, lastname) values('14', 'ram','gowda', 'd');");
			if(result==1)
			{
				System.out.println("Data is added in Database");
			}
			else
			{
				System.out.println("Data is not Added");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
		con.close();
		}
	}

}
