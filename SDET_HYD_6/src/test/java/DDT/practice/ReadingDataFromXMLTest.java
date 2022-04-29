package DDT.practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingDataFromXMLTest {
	
	@Test
	public void readingDataFromXMLTest(XmlTest xml)
	{
		System.out.println(xml.getParameter("url"));
	}

}
