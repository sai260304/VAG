package com.hexaware.dao;
//importing all the required packages
import java.sql.*;
import java.util.*;

import com.hexaware.entity.Artwork;
import com.hexaware.entity.Artist;
import com.hexaware.entity.Gallery;
import com.hexaware.entity.User;
import com.hexaware.myexceptions.*;
import com.hexaware.util.DBConnection;
//creation of virtual art gallery class implementation which implements the all method in the interface
public class IVirtualArtGalleryImpl implements IVirtualArtGallery 
{
	//setting the connection name
    private static Connection con;

    public IVirtualArtGalleryImpl() 
    {
    	//creating the connection to database
        con = DBConnection.getConnection();
    }

    @Override
    public boolean addUser(User user) 
    {
    	//parameterized query to insert the user data into the tables
        String sql = "INSERT INTO User (UserID, Username, Password, Email, FirstName, LastName, DateOfBirth, ProfilePicture) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) 
        {
        	//the below statement the set the data to the table parameter
            stmt.setInt(1, user.getUserID());
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getFirstName());
            stmt.setString(6, user.getLastName());
            stmt.setString(7, user.getDateOfBirth());
            stmt.setString(8, user.getProfilePicture());
            return stmt.executeUpdate() > 0;
        }catch (SQLException e)//sql exception in built 
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addArtist(Artist artist) 
    {
        try 
        {
        	//parameterized query to insert the artist data into the tables
            String sql = "INSERT INTO Artist (ArtistID, Name, Biography, BirthDate, Nationality, Website, ContactInformation) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            //the below statement the set the data to the table parameter
            stmt.setInt(1, artist.getArtistID());
            stmt.setString(2, artist.getName());
            stmt.setString(3, artist.getBiography());
            stmt.setString(4, artist.getBirthDate());
            stmt.setString(5, artist.getNationality());
            stmt.setString(6, artist.getWebsite());
            stmt.setString(7, artist.getContactInformation());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) //sql exception in built
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addArtwork(Artwork artwork) 
    {
        try 
        {
        	//parameterized query to insert the artwork data into the tables
            String sql = "INSERT INTO Artwork (ArtworkID, Title, Description, CreationDate, Medium, ImageURL, ArtistID) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            //the below statement the set the data to the table parameter
            stmt.setInt(1, artwork.getArtworkID());
            stmt.setString(2, artwork.getTitle());
            stmt.setString(3, artwork.getDescription());
            stmt.setString(4, artwork.getCreationDate());
            stmt.setString(5, artwork.getMedium());
            stmt.setString(6, artwork.getImageURL());
            stmt.setInt(7, artwork.getArtistID());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) //sql exception in built
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addGallery(Gallery gallery) 
    {
        try 
        {
        	//parameterized query to insert the gallery data into the tables
            String sql = "INSERT INTO Gallery (GalleryID, Name, Description, Location, CuratorID, OpeningHours) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            //the below statement the set the data to the table parameter
            stmt.setInt(1, gallery.getGalleryID());
            stmt.setString(2, gallery.getName());
            stmt.setString(3, gallery.getDescription());
            stmt.setString(4, gallery.getLocation());
            stmt.setInt(5, gallery.getCuratorID());
            stmt.setString(6, gallery.getOpeningHours());
            return stmt.executeUpdate()>=0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateArtwork(Artwork artwork) {
        try {
        	//query to update the artwork data into the tables
            String sql = "UPDATE Artwork SET Title = ?, Description = ?, CreationDate = ?, Medium = ?, ImageURL = ? WHERE ArtworkID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            //the below statement the set the data to the table parameter
            stmt.setString(1, artwork.getTitle());
            stmt.setString(2, artwork.getDescription());
            stmt.setInt(3, artwork.getArtworkID());
            stmt.setString(4, artwork.getCreationDate());
            stmt.setString(5, artwork.getMedium());
            stmt.setString(6, artwork.getImageURL());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) //sql exception in built
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateGallery(Gallery gallery) {
        try {
        	//query to update the gallery data into the tables
            String sql = "UPDATE Gallery SET Name = ?, Location = ?, CuratorID = ? WHERE GalleryID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setString(1, gallery.getName());
            stmt.setString(2, gallery.getLocation());
            stmt.setInt(3, gallery.getCuratorID());
            stmt.setInt(4, gallery.getGalleryID());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeArtwork(int artworkID) {
        try {
        	//query to delete the artwork data into the tables
            String sql = "DELETE FROM Artwork WHERE ArtworkID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setInt(1, artworkID);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean removeGallery(int galleryID) {
        try {
            String sql = "DELETE FROM Gallery WHERE GalleryID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setInt(1, galleryID);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) //sql exception
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Artwork getArtworkById(int artworkID) throws ArtWorkNotFoundException {
        try {
        	//query to select the artwork data in the tables
            String sql = "SELECT * FROM Artwork WHERE ArtworkID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setInt(1, artworkID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Artwork(
                    rs.getInt("ArtworkID"),
                    rs.getString("Title"),
                    rs.getString("Description"),
                    rs.getString("CreationDate"),
                    rs.getString("Medium"),
                    rs.getString("ImageURL"),
                    rs.getInt("ArtistID")
                );
            } else {
                throw new ArtWorkNotFoundException("Artwork not found with ID:" + artworkID);
            }
        } catch (SQLException e) //sql exception in built
        {
            
            throw new RuntimeException("Database error while fetching artwork with ID: " + artworkID, e);
        }
    }

    @Override
    public List<Artwork> searchArtworks(String keyword) {
        List<Artwork> list = new ArrayList<>();
        try {
        	//query to select the artwork data in the tables
            String sql = "SELECT * FROM Artwork WHERE Title LIKE ? OR Description LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setString(1, "%" + keyword + "%");
            stmt.setString(2, "%" + keyword + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(new Artwork(
                    rs.getInt("ArtworkID"),
                    rs.getString("Title"),
                    rs.getString("Description"),
                    rs.getString("CreationDate"),
                    rs.getString("Medium"),
                    rs.getString("ImageURL"),
                    rs.getInt("ArtistID")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

  
    
    @Override
    public boolean addArtworkToFavorite(int userId, int artworkId) throws UserNotFoundException {
        try {
            // Check if user exists
        	//query to select the user data in the tables
            String checkUserSql = "SELECT COUNT(*) FROM User WHERE UserID = ?";
            PreparedStatement checkUserStmt = con.prepareStatement(checkUserSql);
          //the below statement the set the data to the table parameter
            checkUserStmt.setInt(1, userId);
            ResultSet rsUser = checkUserStmt.executeQuery();
            if (rsUser.next() && rsUser.getInt(1) == 0) {
                throw new UserNotFoundException("User with ID " + userId + " not found.");
            }
          //query to insert the favorite artwork data into the tables
            String sql = "INSERT INTO FavoriteArtworks (UserID, ArtworkID) VALUES (?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setInt(1, userId);
            stmt.setInt(2, artworkId);
            return stmt.executeUpdate() >= 0;
            //customized exception that we created if user not found
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("error occured");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error occured");
        }
        return false;
    }

    @Override
    public boolean removeArtworkFromFavorite(int userId, int artworkId) {
        try {
        	//query to delete the favorite artwork data in the tables
            String sql = "DELETE FROM FavoriteArtworks WHERE UserID = ? AND ArtworkID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setInt(1, userId);
            stmt.setInt(2, artworkId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Artwork> getUserFavoriteArtworks(int userId) {
        List<Artwork> favorites = new ArrayList<>();
        try {
        	//query to select and join the two table the artwork and favorite artwork tables
            String sql = "SELECT a.ArtworkID, a.Title, a.Description, a.CreationDate, a.Medium, a.ImageURL, a.ArtistID "
                       + "FROM Artwork a JOIN FavoriteArtworks f ON a.ArtworkID = f.ArtworkID "
                       + "WHERE f.UserID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                favorites.add(new Artwork(
                    rs.getInt("ArtworkID"),
                    rs.getString("Title"),
                    rs.getString("Description"),
                    rs.getString("CreationDate"),
                    rs.getString("Medium"),
                    rs.getString("ImageURL"),
                    rs.getInt("ArtistID")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return favorites;
    }
    
    @Override
    public List<Gallery> searchGallerys(int galleryID) {
        List<Gallery> lists = new ArrayList<>();
        try {
        	//query to select the gallery data in the tables
            String sql = "SELECT * FROM Gallery WHERE GalleryID=?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setInt(1, galleryID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lists.add(new Gallery(
                    rs.getInt("GalleryID"),
                    rs.getString("Name"),
                    rs.getString("Description"),
                    rs.getString("Location"),
                    rs.getInt("CuratorID"),
                    rs.getString("OpeningHours")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lists;
    }

	@Override
	public List<Artist> viewArtist(int artistID) {
		// TODO Auto-generated method stub
		List<Artist> lists1 = new ArrayList<>();
        try {
        	//query to view the artist data in the tables
            String sql = "SELECT * FROM Artist WHERE ArtistID=?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setInt(1, artistID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lists1.add(new Artist(
                    rs.getInt("artistID"),
                    rs.getString("name"),
                    rs.getString("biography"),
                    rs.getString("birthdate"),
                    rs.getString("nationality"),
                    rs.getString("contactInformation")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lists1;
	}

	@Override
	public List<User> viewUser(int userID) {
		// TODO Auto-generated method stub
		List<User> lists2 = new ArrayList<>();
        try {
        	//query to select the user data in the table with user id
            String sql = "SELECT * FROM User WHERE UserID=?";
            PreparedStatement stmt = con.prepareStatement(sql);
          //the below statement the set the data to the table parameter
            stmt.setInt(1, userID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lists2.add(new User(
                    rs.getInt("UserID"),
                    rs.getString("Username"),
                    rs.getString("password"),
                    rs.getString("email"),
                    rs.getString("firstName"),
                    rs.getString("lastName"),
                    rs.getString("dateOfBirth"),
                    rs.getString("ProfilePicture")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lists2;
	}
}