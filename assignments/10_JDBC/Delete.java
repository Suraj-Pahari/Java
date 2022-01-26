import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Delete {

	public static void main(String[] args)  {
 
		try{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Company-info", "root", "");

		Statement statement = con.createStatement();
		String query = "DELETE FROM `employees` WHERE `eId` = 45";
        
		int res = statement.executeUpdate(query);
		System.out.println("Number of rows affected = " + res);
		con.close();
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

	}
}