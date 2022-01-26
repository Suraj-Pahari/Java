import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class Read{
	
public static void main(String[] args){
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company-info","root","");
			
			Statement statement = con.createStatement(); 
			
			String query = "SELECT * from employees";
			
			ResultSet  rs = statement.executeQuery(query);
//			int rows = statement.executeUpdate(query);
			
			while(rs.next()) {
				
				System.out.println("eID: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Address: "+rs.getString(3));
				System.out.println("======================");
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
