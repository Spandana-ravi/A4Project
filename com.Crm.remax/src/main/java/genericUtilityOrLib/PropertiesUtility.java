package genericUtilityOrLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtility 
{
	public String getDataFromProperties(String data) throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\Selenium\\A4CommonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(data);
		return value;
	}
	

}
