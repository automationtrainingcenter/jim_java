package database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class PreparedStatementDemo {
	private static Connection con;

	public static String readProperty(String propertyName) {
		try {
			FileInputStream fis = new FileInputStream(".\\dbconfig.properties");
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(propertyName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		}
	}

	// retrieve data
	public static ResultSet retrieveData(String cityName) {
		try {
			PreparedStatement selectStmt = con.prepareStatement("select * from city where Name = ?");
			selectStmt.setString(1, cityName);
			return selectStmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// insert Data
	public static void insertData(String name, String coutnryCode, String district, long population) {
		try {
			PreparedStatement insertStmt = con.prepareStatement("insert into city values (10001, ?, ?, ?, ?)");
			insertStmt.setString(1, name);
			insertStmt.setString(2, coutnryCode);
			insertStmt.setString(3, district);
			insertStmt.setLong(4, population);
			insertStmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// update data
	public static void updateData(String[] data) {
		try {
			PreparedStatement updateStmt = con.prepareStatement("update city set District = ?, population = ? where Name = ?");
			updateStmt.setString(1, data[0]);
			updateStmt.setLong(2, Long.parseLong(data[1]));
			updateStmt.setString(3, data[2]);
			updateStmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// delete data
	public static void deleteData(String cityName) {
		try {
			PreparedStatement deleteStmt = con.prepareStatement("delete from city where Name = ?");
			deleteStmt.setString(1, cityName);
			deleteStmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {

		// load driver class dynamically using forName() Class class
		try {
			Class.forName(readProperty("dbdriver"));
			// create conncection to the database using DriverManager class
			con = DriverManager.getConnection(readProperty("dburl"), readProperty("username"),
					readProperty("password"));
//			insertData("Lingampalli", "IND", "Andhra Pradesh", 123455443);
//			String[] data = {"Telangana", "432155667", "Lingampalli"};
//			updateData(data);
			deleteData("Lingampalli");
			ResultSet rs = retrieveData("Lingampalli");
			while (rs.next()) {
				System.out.println(rs.getInt("ID")+"\t"+rs.getString("Name")+"\t"+rs.getString("CountryCode")+"\t"+rs.getString("District")+"\t"+rs.getLong("Population"));
			}
			// close the connection
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
