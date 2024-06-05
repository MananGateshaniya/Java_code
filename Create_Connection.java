import java.sql.*;
public class Create_Connection {
	public static void main(String args[]) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
			if(con!=null) {
				System.out.println("connection created successfully");
				System.out.print(con);
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}
