package com.hexaware.entity;
/*created by Sai Siddarth T S*/

//creation of class artist
public class Artist {
	//initialize the variables
    private int artistID;
    private String name;
    private String biography;
    private String birthDate;
    private String nationality;
    private String website;
    private String contactInformation;
    //creating the parameterized constructor
    public Artist(int artistID, String name, String biography, String birthDate,
                  String nationality, String website, String contactInformation) {
        this.artistID = artistID;
        this.name = name;
        this.biography = biography;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.website = website;
        this.contactInformation = contactInformation;
    }
    //sub constructor method
    public Artist(int int1, String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
    	this.artistID=int1;
    	this.name=string;
    	this.biography=string2;
    	this.birthDate=string3;
    	this.nationality=string4;
    	this.contactInformation=string5;
	}

	// Getters and Setters of all the methods
    public int getArtistID() { 
    	return artistID; 
    }
    public void setArtistID(int artistID) { 
    	this.artistID = artistID; 
    }
    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }
    public String getBiography() { 
    	return biography; 
    }
    public void setBiography(String biography) { 
    	this.biography = biography; 
    }
    public String getBirthDate() { 
    	return birthDate; 
    }
    public void setBirthDate(String birthDate) { 
    	this.birthDate = birthDate; 
    }
    public String getNationality() { 
    	return nationality; 
    }
    public void setNationality(String nationality) { 
    	this.nationality = nationality; 
    }
    public String getWebsite() { 
    	return website; 
    }
    public void setWebsite(String website) { 
    	this.website = website; 
    }
    public String getContactInformation() { 
    	return contactInformation; 
    }
    public void setContactInformation(String contactInformation) { 
    	this.contactInformation = contactInformation; 
    }
}