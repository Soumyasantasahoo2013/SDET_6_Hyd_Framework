package DDT.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadingDataFromJSONTest {
	
	@Test
	public void readingDataFromJSONTest() throws Throwable
	{
		//Step-1 Convert Physical file into Java Object
		FileReader fr=new FileReader("./commonData.json");
		
		//Step=2 Convert Json object into Java Object
		JSONParser jp=new JSONParser();
		Object jobj = jp.parse(fr);
		
		//Step=3 Reading the Data
		HashMap hp = (HashMap)jobj;
		String URL=(String) hp.get("url");
		System.out.println(URL);
	}

}
