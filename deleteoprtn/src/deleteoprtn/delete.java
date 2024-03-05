package deleteoprtn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class delete {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "praveer");

	        Statement st = con.createStatement();

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter student Id: ");
	        int id = sc.nextInt();
	        int rowsAffected = st.executeUpdate("DELETE FROM students WHERE id = " + id);
	        System.out.println(rowsAffected + " record deleted!!!");

	        sc.close();
	        con.close();

	}

}
