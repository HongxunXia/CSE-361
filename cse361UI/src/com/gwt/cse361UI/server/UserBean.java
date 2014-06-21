
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import unl.cse.JPA2.ConnectionBean;


public class UserBean {
	
	private static Logger log = Logger.getLogger(UserBean.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
	}
	
	public static ArrayList<User> getAllUser(){
		
		//Create an ArrayList to fill with users and return upon completion
		ArrayList<User> userList = new ArrayList<User>();
		
		//Query the database and create new Users with each line in the Result Set
		
		Connection conn = ConnectionBean.getConnection();
		
		String query = "SELECT * FROM User";
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				int userID = rs.getInt("UserID");
				String username = rs.getString("Username");
				User a = new User(userID, username);
				userList.add(a);
			} //end while
			rs.close();
		} catch (SQLException e) {
			System.out.println("SQLException: ");
			e.printStackTrace();
			log.error("ClassNotFoundException: ", e);
			throw new RuntimeException(e);
		}
		ConnectionBean.closeConnection(rs, ps, conn);
		return userList;
	}
}
