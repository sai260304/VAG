package com.hexaware.dao;
//importing the required packages
import java.util.List;

import com.hexaware.entity.Artwork;
import com.hexaware.entity.Artist;
import com.hexaware.entity.Gallery;
import com.hexaware.entity.User;
import com.hexaware.myexceptions.ArtWorkNotFoundException;
import com.hexaware.myexceptions.UserNotFoundException;

//creation of interface virtual art gallery
public interface IVirtualArtGallery 
{
	//implementing the addArtwork method in interface class
	boolean addArtwork(Artwork artwork);
	//implementing the updateArtwork method in interface class
    boolean updateArtwork(Artwork artwork);
    //implementing the removeArtwork method in interface class
    boolean removeArtwork(int artworkID);
    //get artwork by id method with exception
    Artwork getArtworkById(int artworkID) throws ArtWorkNotFoundException;
    //implementing the add user method in interface class
    boolean addUser(User user);
    //implementing the add Artist method in interface class
    boolean addArtist(Artist artist);
    //implementing the add gallery method in interface class
    boolean addGallery(Gallery gallery);
    //implementing the update gallery method in interface class
    boolean updateGallery(Gallery gallery);
    //implementing the remove gallery method in interface class
    boolean removeGallery(int galleryID);
    //implementing the list type search Artwork method in interface class
    List<Artwork> searchArtworks(String keyword);
    //implementing the list type search gallery method in interface class
    List<Gallery> searchGallerys(int galleryID);
    //implementing the list type view artist method in interface class
    List<Artist> viewArtist(int artistID);
    //implementing the list type view artist method in interface class
    List<User> viewUser(int userID);
    //implementing the add Artwork to favorite method in interface class with exceptions
    boolean addArtworkToFavorite(int userId, int artworkId) throws UserNotFoundException;
    //implementing the remove artwork from favorite method in interface class
    boolean removeArtworkFromFavorite(int userId, int artworkId);
    //implementing the list type get user fav artwork method in interface class
    List<Artwork> getUserFavoriteArtworks(int userId);
}