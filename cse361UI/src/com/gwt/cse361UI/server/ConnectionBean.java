

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;



public class ConnectionBean {
	
	private static Logger log = Logger.getLogger(PortfolioData.class);
	
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			System.out.println("InstantiationException: ");
			e.printStackTrace();
			log.error("ClassNotFoundException: ", e);
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			System.out.println("IllegalAccessException: ");
			e.printStackTrace();
			log.error("ClassNotFoundException: ", e);
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: ");
			e.printStackTrace();
			log.error("ClassNotFoundException: ", e);
			throw new RuntimeException(e);
		}
		
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(DatabaseInfo.url, DatabaseInfo.username, DatabaseInfo.password);
		} catch (SQLException e) {
			System.out.println("SQLException: ");
			e.printStackTrace();
			log.error("ClassNotFoundException: ", e);
			throw new RuntimeException(e);
		}
		return conn;
		
	}//end getConnection()
		
	public static void closeConnection(ResultSet rs, PreparedStatement ps, Connection conn ){
		try {
			if(rs != null && !rs.isClosed())
				rs.close();
			if(ps != null && !ps.isClosed())
				ps.close();
			if(conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			System.out.println("SQLException: ");
			e.printStackTrace();
			log.error("ClassNotFoundException: ", e);
			throw new RuntimeException(e);
		}
	}// end closeConnection()
	
}//end class
