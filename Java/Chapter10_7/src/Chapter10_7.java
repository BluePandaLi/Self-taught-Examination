import java.applet.Applet;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Chapter10_7 extends Applet {

	public Chapter10_7() throws HeadlessException {
		
		connnectByJdbcOdbc("test", "test", "password");
		
	}

	public static Connection connnectByJdbcOdbc(String url, String username, String password) {
		
		java.sql.Connection con = null;
		
		try {
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
		}
		
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}
