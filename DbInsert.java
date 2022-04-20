package abc;
import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.jdbc.exceptions.SQLError;

class DbInsert {

	public static void main(String[] args) throws SQLException{
		Connection con = null;
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
//			Statement stm = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement( "select * from emp where id =?");
			
			System.out.println("Enter id");
			int id = sc.nextInt();
			
			pstmt.setInt(1, id);
			ResultSet rs = rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " "  + rs.getString("name") + " " + rs.getInt("salary") + " " +rs.getString("desig"));
			}			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
	}

}
