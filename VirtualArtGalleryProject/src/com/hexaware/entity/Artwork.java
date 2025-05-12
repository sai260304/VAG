package com.hexaware.entity;
//creation of artwork class

/*created by Sai Siddarth T S*/
public class Artwork {
	//initialize the variables
    private int artworkID;
    private String title;
    private String description;
    private String creationDate;
    private String medium;
    private String imageURL;
    private int artistID;

    // 🔹 Constructor with 3 parameters (for update & add minimal info)
    public Artwork(int artworkID, String title, String description,String creationDate, String medium, String imageURL) {
        this.artworkID = artworkID;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.medium = medium;
        this.imageURL = imageURL;
    }

    // 🔹 Full constructor with all parameters
    public Artwork(int artworkID, String title, String description, String creationDate, String medium, String imageURL, int artistID) {
        this.artworkID = artworkID;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.medium = medium;
        this.imageURL = imageURL;
        this.artistID = artistID;
    }

    // 🔹 Getters and Setters for all the methods
    public int getArtworkID() {
        return artworkID;
    }
    public void setArtworkID(int artworkID) {
        this.artworkID = artworkID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public String getMedium() {
        return medium;
    }
    public void setMedium(String medium) {
        this.medium = medium;
    }
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public int getArtistID() {
        return artistID;
    }
    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }
}