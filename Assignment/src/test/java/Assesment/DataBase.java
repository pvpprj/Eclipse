package Assesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class DataBase {

	@Test
	public void TestVerifyDB() {

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection("jdbc:odbc:Test_Oracle", "system", "selenium");

			System.out.println("Connection created");

			Statement smt = con.createStatement();
			System.out.println("Statement created");

			ResultSet rs = smt.executeQuery("Select * from Facebook");

			System.out.println("Query Executed");

			while (rs.next()) {

				String uname = rs.getString("username");
				String pass = rs.getString("password");
				String email = rs.getString("email");

				System.out.println("Uname is " + uname + " password is " + pass + " email id is " + email);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}