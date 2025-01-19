package methodrefOptional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account {
	
	public static void Balance() {
		System.out.println("Getting balance...");
	}
	
	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306/your_database";
		String user = "your_username";
		String password = "your_password";

		try (Connection connection = DriverManager.getConnection(url, user, password)) {


			String sql = "SELECT * FROM employees WHERE department = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			    preparedStatement.setString(1, "Sales"); // Set the parameter
			    ResultSet resultSet = preparedStatement.executeQuery(); // Execute the query

			    while (resultSet.next()) {
			        // Retrieve data from the result set
			        int id = resultSet.getInt("id");
			        String name = resultSet.getString("name");
			        System.out.println("ID: " + id + ", Name: " + name);
			    }
			} catch (SQLException e) {
			    e.printStackTrace();
			}
			
			
		} catch (SQLException e) {
		    e.printStackTrace();
		}
		
	}

}
