import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
public class jdbc1 {

	public static void main(String[] args) {
		try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
    		  "root", "");
      Statement statement;
    //  Statement  stmt = con.createStatement();
      System.out.print("Connection Successfull.");
      
	} catch (Exception e) {
		System.out.println("Error="+e);
	}
	}

}
