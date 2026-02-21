
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	public Connection dbConnection() {
		Connection connection= null;
		
		try {
		String url ="jdbc:mysql://localhost:3306/rnsit";
		String userName="root";
		String password ="Subbu@895";
		connection = DriverManager.getConnection(url,userName,password);	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
