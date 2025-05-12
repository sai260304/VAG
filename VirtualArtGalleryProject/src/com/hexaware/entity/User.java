package com.hexaware.entity;
/*created by Sai Siddarth T S*/

//creation of class user
public class User {
	//initialize the variables
    private int userID;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String profilePicture;
    //constructor with parameter
    public User(int userID, String username, String password, String email,
                String firstName, String lastName, String dateOfBirth) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
//        this.profilePicture = profilePicture;
    }
    //sub constructor implemention 
    public User(int int1, String string, String string2, String string3, String string4, String string5, String string6, String string7) {
    	this.userID=int1;
    	this.username=string;
    	this.password=string2;
    	this.email=string3;
    	this.firstName=string4;
    	this.lastName=string5;
    	this.dateOfBirth = string6;
        this.profilePicture = string7;
	}
	// Getters and Setters for all the methods
    public int getUserID() { 
    	return userID; 
    }
    public void setUserID(int userID) { 
    	this.userID = userID; 
    }
    public String getUsername() { 
    	return username; 
    }
    public void setUsername(String username) { 
    	this.username = username; 
    }
    public String getPassword() { 
    	return password; 
    }
    public void setPassword(String password) { 
    	this.password = password; 
    }
    public String getEmail() { 
    	return email; 
    }
    public void setEmail(String email) { 
    	this.email = email; 
    }
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
    public String getDateOfBirth() { 
    	return dateOfBirth; 
    }
    public void setDateOfBirth(String dateOfBirth) { 
    	this.dateOfBirth = dateOfBirth; 
    }
    public String getProfilePicture() { 
    	return profilePicture; 
    }
    public void setProfilePicture(String profilePicture) { 
    	this.profilePicture = profilePicture; 
    }
}