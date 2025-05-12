package com.hexaware.entity;
/*created by Sai Siddarth T S*/

//creation of class favorite artworks
public class FavoriteArtworks {
	private int userID;
	private int artworkID;
	//creation of parameterized constructor
	public FavoriteArtworks(int userID, int artworkID) {
		super();//which the immediate parent class object
		this.userID = userID;
		this.artworkID = artworkID;
	}
	// Getters and Setters for all the methods
	public int getUserID() { 
		return userID; 
	}
	public void setUserID(int userID) { 
		this.userID = userID; 
	}
	public int getArtworkID() { 
		return artworkID; 
	}
	public void setArtworkID(int artworkID) { 
		this.artworkID = artworkID; 
	}
}
