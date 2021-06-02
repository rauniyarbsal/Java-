import java.sql.*;
class MyConn{
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			Statement stmt = con.createStatement();
			//String sql = "select * from bookss";
			//String sql1 = "insert into bookss values(1,'ram', 'java', 7, 'atlas')";
			String sql2 = "update bookss set name = 'hari' where bid = 1";
			//String sql3 = "delete from bookss where bid = 5";
			//ResultSet rs = stmt.executeQuery(sql);
			//ResultSet rs1 = stmt.executeQuery(sql1);
			ResultSet rs2 = stmt.executeQuery(sql2);
			//ResultSet rs3 = stmt.executeQuery(sql3);
		
			//while(rs.next()) {
			//	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5));
			//}
			con.close();
			}catch(Exception e) {
			System.out.println(e);
		}
	}
}