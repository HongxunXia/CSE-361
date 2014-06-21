import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
//import java.io.FileOutputStream;
//import java.io.File;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;


@SuppressWarnings("unused")

@Entity
@Table(name="Person")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
@DiscriminatorValue("C");
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.Auto)
	@Column(name="UserID", nullable = false)
	int UserID;
	
	@Column(name="sername", nullable = false)
	String username;
	private int userID;

	public User (int userID, String username){
		this.userID = userID;
		this.username = username;
	}
	
	
//The following are scratch methods for what a User should be able to do, as dictated in the requirements
/*
	public static void deletePicture(String id){
		for (Picture picture in PICTURETABLE){
			if (picture.getId() == id){
				for (Comment comment in picture.getComments()){
					REMOVE comment FROM COMMENTTABLE
				}
				REMOVE picture FROM PICTURETABLE
			}
		}
	}
	
	public static void deleteComment(String id){
		for (Comment comment in COMMENTTABLE){
			if (comment.getId() == id){
				REMOVE FROM COMMENTTABLE
			}
		}
	}

	public static ArrayList<Picture> searchByUser(String userId){

	}
	
	public static ArrayList<Picture> searchByComment(String userId){
		
	}
	
	public static ArrayList<Picture> searchByDistance(Location location){
		
	}
*/

	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTwitterHandle() {
		return twitterHandle;
	}
	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
