import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class Update {
	
	public static void main(String[] args){
		
		try { 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
     		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Company-info", "root", "");

	    	Statement statement = con.createStatement();
			String query = "UPDATE `employees` SET `Name` = 'Ram', `eID` = '45', `address` = 'Lakeside' WHERE `eID` = '25'";
			
		    int res = statement.executeUpdate(query);
		    System.out.println("Number of rows affected = " + res);
	    	con.close();
	    	
	    }catch(Exception e) {
	    	
	    	System.out.println(e.getMessage());
	    
	    }
	}
}