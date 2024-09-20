import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class ReadData {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/techm";
		String username = "root";
		String password = "Abhayroot";
		
		Statement statement = null;
		Connection connection = null;
		ResultSet resultSet = null;
		try {
			
			// Establish a connection between java and database
			connection = DriverManager.getConnection(url, username, password);
			
			if(connection != null) {
				// Create a Statement object
				statement = connection.createStatement();
				
				if(statement != null) {
					// Using statement object to execute the query
					String selectQuery = "SELECT WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT FROM Worker";
					resultSet = statement.executeQuery(selectQuery);
					
					if(resultSet != null) {
						// Process the ResultSet
						while(resultSet.next()) {
							System.out.println("Worker_id\tFirst_Name\tLastName\tSalary\tJoining_Date\tDepartment");
							Integer workerId = resultSet.getInt("WORKER_ID");
							String firstName = resultSet.getString("FIRST_NAME");
							String lastName = resultSet.getString("LAST_NAME");
							Integer salary = resultSet.getInt("SALARY");
							String joiningDate = resultSet.getString("JOINING_DATE");
							String department = resultSet.getString("DEPARTMENT");
							System.out.println(workerId+"\t"+firstName+"\t"+lastName+"\t"+salary+"\t"+joiningDate+"\t"+department);
						}
					}
				}
			}
			
		} catch(SQLException sq) {
			sq.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(statement != null)
				statement.close();
			if(resultSet != null)
				resultSet.close();
			if(connection != null)
				connection.close();
		}
	}
}
