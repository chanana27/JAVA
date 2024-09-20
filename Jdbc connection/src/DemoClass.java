import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class DemoClass{
	public static void main(String [] args) throws SQLException, ClassNotFoundException {
		
	// STEP 1. Load and Register the driver
	
//	Driver driver = new Driver();
//	DriverManager.registerDriver(driver);
//	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver Registered Successfully");

	// STEP 2. Establish the connection between java and database
	// jdbc url syntax: <mainprotocol>:<subprotocol>:<subname>
	
	String url = "jdbc:mysql://localhost:3306/techm";
	String username = "root";
	String password = "Abhayroot";

	Connection connection = DriverManager.getConnection(url, username, password);
	System.out.println("Connection object is created:: "+ connection);

	// Create a Statement object
	Statement statement = connection.createStatement();
	System.out.println("Statement object is created::"+statement);

	// Send and execute the query
	String sqlSelectQuery = "SELECT FIRST_NAME FROM Worker WHERE WORKER_ID = 3";
	ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
	System.out.println("ResutlSet object is created::"+resultSet);

	resultSet.next();
		
	String firstName = resultSet.getString("First_name");
	System.out.println(firstName);

	statement.close();
	resultSet.close();
	connection.close();

	}
}