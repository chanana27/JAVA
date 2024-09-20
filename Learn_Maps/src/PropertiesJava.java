import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesJava {

	public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		properties.setProperty("URL","localhost:3306/mysql/jdbc");
		properties.setProperty("USERNAME", "root");
		properties.setProperty("PASSWORD", "Abhayroot");

		FileOutputStream fos = new FileOutputStream("database.properties");
		properties.store(fos, "got stored");
		
		FileInputStream fin =new FileInputStream("database.properties");
		properties.load(fin); //data loaded into properties object using fin
		
		System.out.println(properties);
		
		System.out.println("url is "+ properties.getProperty("URL"));
	}

}
