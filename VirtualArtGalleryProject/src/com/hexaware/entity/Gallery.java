package com.hexaware.entity;
/*created by Sai Siddarth T S*/

//creation of class gallery
public class Gallery {
    private int galleryID;
    private String name;
    private String description;
    private String location;
    private int curatorID;
    private String openingHours;
    
    // 🔹 Constructor with 3 parameters (for update & add minimal info)
    public Gallery(int galleryID, String name, String location, int curatorID, String description) {
        this.galleryID = galleryID;
        this.name = name;
        this.location = location;
        this.curatorID = curatorID;
        this.description = description;
    }
    //sub constructor implemention of all the variables
    public Gallery(int galleryID, String name, String description, String location,
                   int curatorID, String openingHours) {
        this.galleryID = galleryID;
        this.name = name;
        this.description = description;
        this.location = location;
        this.curatorID = curatorID;
        this.openingHours = openingHours;
    }

    // Getters and Setters for all the methods
    public int getGalleryID() { 
    	return galleryID; 
    }
    public void setGalleryID(int galleryID) { 
    	this.galleryID = galleryID; 
    }
    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }
    public String getDescription() { 
    	return description; 
    }
    public void setDescription(String description) { 
    	this.description = description; 
    }
    public String getLocation() { 
    	return location; 
    }
    public void setLocation(String location) { 
    	this.location = location; 
    }
    public int getCuratorID() { 
    	return curatorID; 
    }
    public void setCuratorID(int curatorID) { 
    	this.curatorID = curatorID; 
    }
    public String getOpeningHours() { 
    	return openingHours; 
    }
    public void setOpeningHours(String openingHours) { 
    	this.openingHours = openingHours; 
    }
}