package DDT.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDataFromPropertyFileTest {
	
	@Test
	public void readingDataFromPropertyTest() throws Throwable
	{
		//Step=1 Convert Physical File into Java Object
		FileInputStream fis=new FileInputStream("./commonData.properties");
		
		//Step=2 Load the Java Object
		Properties p=new Properties();
		p.load(fis);
		
		//Step=3 Read the Data
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("un"));
		System.out.println(p.getProperty("pwd"));
	}

}
