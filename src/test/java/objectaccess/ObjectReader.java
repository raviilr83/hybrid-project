package objectaccess;

import java.io.FileInputStream;
import java.util.Properties;

public class ObjectReader {

	//public static void main(String[] args) {
		public static Properties readObject() {
		
		Properties prop  = null;
		
		try
		{
			
			FileInputStream fs = new FileInputStream("C:\\Users\\ravis\\eclipse-workspace\\HybridProject\\src\\test\\java\\objects\\objects.properties");
			prop = new Properties();
			prop.load(fs);
			
			//System.out.println(prop.getProperty("url"));
			//System.out.println(prop.getProperty("abpath"));
				
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return prop;
	}

}
