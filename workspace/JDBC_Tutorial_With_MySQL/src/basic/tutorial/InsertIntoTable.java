package basic.tutorial;

import java.sql.*;

public class InsertIntoTable {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "7737635304";
		String sql = "INSERT INTO Student " + "VALUES (11, 'Choudhary', 'Arvind', 'Vyas Colony','Bikaner') ";

		String sql1 = "Select * from Student";

		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);

			statement = conn.createStatement();
			statement.executeUpdate(sql);

			resultSet = statement.executeQuery(sql1);

			while (resultSet.next()) {
				System.out.println("Name: " + resultSet.getString(3));

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.exit(0);
		} finally {
			statement.close();

			resultSet.close();

		}
	}

}
