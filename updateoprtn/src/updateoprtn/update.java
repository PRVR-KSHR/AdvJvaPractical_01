package updateoprtn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "praveer");
	
	Statement st = con.createStatement();
    Scanner sc = new Scanner(System.in);

	System.out.println("Enter student's Id: ");
	int id = sc.nextInt();
	System.out.println("Enter student new Name: ");
	String name = sc.next();
	String query = String.format("update students set name='%s' where id = %d", name, id);
	int rowsAffected = st.executeUpdate(query);
	System.out.println(rowsAffected+ " record updated!!!");
	}
}
