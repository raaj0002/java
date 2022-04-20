package abc;
import java.sql.*;
import java.util.Scanner;

class nautanki {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
//			Statement stm = con.createStatement();
//			stm.execute("insert into emp values(2,'ravie',25,1000,'intern')");
			
			PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?,?,?)");
//			PreparedStatement pstmt = con.prepareStatement("UPDATE emp SET name = 'ravi' WHERE id = (?)");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter id");
			int id = sc.nextInt();
			
			System.out.println("Enter name");
			String name = sc.next();
			
			System.out.println("Enter age");
			int age = sc.nextInt();
			
			System.out.println("Enter salary");
			int sal = sc.nextInt();
			
			System.out.println("Enter desig");
			String desig = sc.next();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setInt(4, sal);
			pstmt.setString(5, desig);
			pstmt.execute();
			
			con.close();
			System.out.println("DATA INSERTED");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
