import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
public class Insert {
	
	public static void main(String[] args){
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company-info","root","");
			
			Statement statement = con.createStatement(); 
			
			String query = "INSERT INTO employees (`eID`,`Name`,`Address`) VALUES ('97','Ram','Malepatan')";
			
			int rows = statement.executeUpdate(query);
			
			System.out.println("Number of rows affected = " + rows);
			
			con.close();
			
			
		}catch(Exception e) { 

			System.out.println(e.getMessage());
		}
		
	}

}
