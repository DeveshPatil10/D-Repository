package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigureFileMethod {
	
public static String Readconfigurefile(String readdata) throws IOException
	{
	Properties prop = new Properties();
	
	String path = System.getProperty("user.dir")+"\\Configure.properties";
	
	FileInputStream fis = new FileInputStream(path);
	
	prop.load(fis);
	
	String url = prop.getProperty(readdata);
	
	System.out.println(url);
	
	return url;
}
}