package JAVADATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JBBCTUTORIAL {
   public static void main(String[] args) throws SQLException {
	   String url = "jdbc:mysql://localhost:3306/TEJA2";
	   String name = "root";
	   String  password = "teja@12";
	   Connection cn1 = DriverManager.getConnection(url, name,password);
	Statement s = cn1.createStatement();
//     String sql = "create table TEJA3(id int ,name char(20),location char(20))";
//	int val =  s.executeUpdate(sql);
//	System.out.println("row effected");
//       String sql2 = "insert into TEJA3 values (20,'suresh','germany'),(19,'subhash','london'),(29,'rajesh','canada')";
//	   s.executeUpdate(sql2);
//	String sql3 = "update TEJA3 SET name = 'ramesh' where id = 20";
//	s.executeUpdate(sql3);
//	String sql4  = "drop table TEJA3";
//	s.executeUpdate(sql4);
//	String sql5 = "create table TEJA4(ID INT ,NAME CHAR(20) ,marks int)";
//	int val =  s.executeUpdate(sql5);
//	String sql6 = "insert into TEJA4 values(?,?,?)";
//	PreparedStatement ps = cn1.prepareStatement(sql6);
//	ps.setInt(1,22216);
//	ps.setString(2, "teja");
//	ps.setInt(3,55);
	
//	String sql7 = "SELECT SUM(MARKS) FROM TEJA2";
//	
//	ResultSet rs = s.executeQuery(sql7);
//	if(rs.next()) {
//		System.out.println(rs.getInt("MARKS"));
//	}
	ResultSet rs1 = s.executeQuery("Select MAX(MARKS) AS Marks1 FROM TEJA2");
	if(rs1.next()) {
		System.out.println(rs1.getInt("Marks1"));
	}
	ResultSet rs2 = s.executeQuery("Select COUNT(NAME)AS NAMES FROM TEJA2");
	if(rs2.next()) {
		System.out.println(rs2.getString("NAMES"));
	}
//	while(rs.next()) {
//	System.out.println(rs.getString("name")+ " "+ rs.getString("LOCATION")+" "+ rs.getInt("marks"));
//	}
	System.out.println("1 row affected");
	cn1.close();
	

   }
}
