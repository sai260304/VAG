//main package implementation
package com.hexaware.main;
//importing all the packages to perform the operation
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.IVirtualArtGalleryImpl;
import com.hexaware.entity.Artist;
import com.hexaware.entity.Artwork;
import com.hexaware.entity.Gallery;
import com.hexaware.entity.User;
import com.hexaware.myexceptions.ArtWorkNotFoundException;
import com.hexaware.myexceptions.UserNotFoundException;
//class main where the program execution starts from here.

/*Created By
            - Sai Siddarth T S*/

public class Main {
	public static void main(String[] args) {
		//creation of service object that implements the virtual art gallery class in the dao packages
		IVirtualArtGalleryImpl service = new IVirtualArtGalleryImpl();
		try(Scanner scanner = new Scanner(System.in))
		{
		int choice;
		//do while -->that execute the statements at least one time even if the condition fails
		do {
			//main menu which display all the function that we can perform
			System.out.println("=============Welcome============");
			System.out.println("====Virtual Art Gallery Menu====");
			System.out.println("--------------------------------");
			System.out.println("1.  Add User Details");
			System.out.println("2.  Add Artist Details");
			System.out.println("3.  Add Artwork Details");
			System.out.println("4.  Add Gallery Details");
			System.out.println("5.  Update Artwork Details");
			System.out.println("--------------------------------");
			System.out.println("6.  Update Gallery Details");
			System.out.println("7.  View Artwork by ArtworkID");
			System.out.println("8.  Search Artworks Details");
			System.out.println("9.  Add User Favorites Artwork");
			System.out.println("10. View Favorites By UserID");
			System.out.println("--------------------------------");
			System.out.println("11. Remove from Favorites By ArtworkID");
			System.out.println("12. Remove Artwork Data");
			System.out.println("13. Remove Gallery Data");
			System.out.println("14. Search Gallery Details");
			System.out.println("15. View Artist by ArtistID");
			System.out.println("16. View User by UserID");
			System.out.println("--------------------------------");
			System.out.println("0.  Exit From Virtual Art Gallery");
			System.out.println("--------------------------------");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			//switch case based on the input that we give it perform the operation
			switch (choice) {
			//case 1 used to add the user details in the user tables
			case 1->{
				System.out.print("Enter User ID: ");
				int uid = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Username: ");
				String uname = scanner.nextLine();
				System.out.print("Enter Password: ");
				String pwd = scanner.nextLine();
				System.out.print("Enter Email: ");
				String email = scanner.nextLine();
				System.out.print("Enter First Name: ");
				String firstName = scanner.nextLine();
				System.out.print("Enter Last Name: ");
				String lastName = scanner.nextLine();
				System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
				String dob = scanner.nextLine();
				System.out.print("Enter Profile Picture URL (or path): ");
				String profilePic = scanner.nextLine();

				User user = new User(uid, uname, pwd, email, firstName, lastName, dob, profilePic);
				System.out.println("User added: " + service.addUser(user));
				break;
			}
			//case 2 used to add the artist details in the artist tables
			case 2->{
			    System.out.print("Enter Artist ID: ");
			    int artistId = scanner.nextInt();
			    scanner.nextLine();
			    System.out.print("Enter Name: ");
			    String name = scanner.nextLine();
			    System.out.print("Enter Biography: ");
			    String bio = scanner.nextLine();
			    System.out.print("Enter Birth Date (YYYY-MM-DD): ");
			    String birthDate = scanner.nextLine();
			    System.out.print("Enter Nationality: ");
			    String nationality = scanner.nextLine();
			    System.out.print("Enter Website: ");
			    String website = scanner.nextLine();
			    System.out.print("Enter Contact Info: ");
			    String contact = scanner.nextLine();

			    Artist artist = new Artist(artistId, name, bio, birthDate, nationality, website, contact);
			    System.out.println("Artist added: " + service.addArtist(artist));
			    break;

			}
			//case 3 used to add the artwork details in the artwork tables
			case 3->{
				System.out.print("Enter Artwork ID: ");
				int addId = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Description: ");
				String desc = scanner.nextLine();
				System.out.print("Enter Creation Date: ");
				String date = scanner.nextLine();
				System.out.print("Enter Medium: ");
				String medium = scanner.nextLine();
				System.out.print("Enter Image URL: ");
				String imgUrl = scanner.nextLine();
				System.out.print("Enter Artist ID: ");
				int artistRefId = scanner.nextInt();
				Artwork newFullArt = new Artwork(addId, title, desc, date, medium, imgUrl, artistRefId);
				System.out.println("Artwork Added: " + service.addArtwork(newFullArt));
				break;
			}
			//case 4 used to add the gallery details in the gallery tables
			case 4->{ // Add Gallery
                System.out.print("Enter Gallery ID: ");
                int galleryId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Gallery Name: ");
                String gName = scanner.nextLine();
                System.out.print("Enter Description: ");
                String gDesc = scanner.nextLine();
                System.out.print("Enter Location: ");
                String location = scanner.nextLine();
                System.out.print("Enter Curator (Artist ID): ");
                int curatorID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Opening Hours: ");
                String openingHours = scanner.nextLine();

                Gallery gallery = new Gallery(galleryId, gName, gDesc, location, curatorID, openingHours);
                System.out.println("Gallery added: " + service.addGallery(gallery));
                break;
			}
			//case 5 used to update the artwork details in the artwork tables
			case 5->{
				System.out.print("Enter Artwork ID to update: ");
				int updateId = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter New Title: ");
				String newTitle = scanner.nextLine();
				System.out.print("Enter New Description: ");
				String newDesc = scanner.nextLine();
				System.out.print("Enter New CreationDate: ");
				String newcrdt = scanner.nextLine();
				System.out.print("Enter New Medium: ");
				String newmed = scanner.nextLine();
				System.out.print("Enter New ImageURL: ");
				String newimgu = scanner.nextLine();
				Artwork updatedArt = new Artwork(updateId, newTitle, newDesc, newcrdt, newmed, newimgu);
				System.out.println("Artwork Updated: " + service.updateArtwork(updatedArt));
				break;
			}
			//case 6 used to update the gallery details in the gallery tables
			case 6->{
				System.out.print("Enter Gallery ID to update: ");
				int updateGid = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter New Name: ");
				String newGName = scanner.nextLine();
				System.out.print("Enter New Location: ");
				String newLocation = scanner.nextLine();
				System.out.print("Enter New Curator ID: ");
				int newCurator = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter New Description: ");
				String newdsc = scanner.nextLine();
				Gallery updatedGallery = new Gallery(updateGid, newGName, newLocation, newCurator, newdsc);
				System.out.println("Gallery Updated: " + service.updateGallery(updatedGallery));
				break;
			}
			//case 7 used to view the artwork details in the artwork tables based on the artwork ID
			case 7->{
				try {
					System.out.print("Enter Artwork ID to view: ");
					int viewId = scanner.nextInt();
					Artwork art = service.getArtworkById(viewId); // may throw exception

					System.out.println("\nArtwork Details:");
					System.out.println("ID: " + art.getArtworkID());
					System.out.println("Title: " + art.getTitle());
					System.out.println("Description: " + art.getDescription());
					System.out.println("Location: " + art.getMedium());
					System.out.println("Description: " + art.getImageURL());
					System.out.println("ArtistID: " + art.getArtistID());
				} catch (ArtWorkNotFoundException e) {
					System.out.println(e.getMessage());
					break;
				}
				break;
			}
			//case 8 used to search the artwork details in the artwork tables with the title and description names
			case 8->{
			    System.out.print("Enter keyword to search Artwork (Title or Description Name): ");
			    String keyword = scanner.nextLine();
			    List<Artwork> results = service.searchArtworks(keyword);
			    
			    if (results.isEmpty()) {
			        System.out.println("No artworks found for the keyword: " + keyword);
			    } else {
			        System.out.println("Search Results:");
			        for (Artwork a : results) {
			            System.out.println("-> ArtworkID : " + a.getArtworkID() + ", Title : " + a.getTitle() + ", Description : " + a.getDescription() + ", Medium : " +a.getMedium() + ", ImageURL : " +a.getImageURL() + ", ArtistID : " +a.getArtistID());
			        }
			    }
			    break;
			}
			//case 9 used to add the user favorite artwork details in the user favorite artwork tables
			case 9->{
				System.out.print("Enter User ID: ");
				int favUserId = scanner.nextInt();
				System.out.print("Enter Artwork ID to favorite: ");
				int favArtId = scanner.nextInt();
				try {
					boolean success = service.addArtworkToFavorite(favUserId, favArtId);
					if (success) {
						System.out.println("Artwork added to favorites successfully.");
					} else {
						System.out.println("Failed to add to favorites.");
					}
				} catch (UserNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			//case 10 used to retrieve the user favorite details in the favorite artwork tables
			case 10->{
				System.out.print("Enter User ID to view favorites: ");
				int viewFavUserId = scanner.nextInt();
				List<Artwork> favs = service.getUserFavoriteArtworks(viewFavUserId);
				System.out.println("Favorites:");
				for (Artwork a : favs) {
					System.out.println("-> ArtworkID : " + a.getArtworkID() + ", Title : " + a.getTitle() + ", Description : " +a.getDescription() + ", Creation Date : "+a.getCreationDate()+", Medium : "+a.getMedium()+", ImageURL : "+a.getImageURL()+", ArtistID : "+a.getArtistID());
				}
				break;
			}
			//case 11 used to remove the user favorite artwork details in the favorite artwork tables
			case 11->{
				System.out.print("Enter User ID: ");
				int rmUserId = scanner.nextInt();
				System.out.print("Enter Artwork ID to remove from favorites: ");
				int rmArtId = scanner.nextInt();
				System.out.println("Removed from Favorites: " + service.removeArtworkFromFavorite(rmUserId, rmArtId));
				break;
			}
			//case 12 used to delete the artwork details in the artwork table by the artwork ID
			case 12->{
				System.out.print("Enter Artwork ID to delete: ");
				int delId = scanner.nextInt();
				System.out.println("Artwork Deleted: " + service.removeArtwork(delId));
				break;
			}
			//case 13 used to delete the gallery details in the gallery table by the gallery ID
			case 13->{
				System.out.print("Enter Gallery ID to delete: ");
				int removeGid = scanner.nextInt();
				System.out.println("Gallery Deleted: " + service.removeGallery(removeGid));
				break;
			}
			//case 14 used to search the gallery details in the gallery table by the gallery ID
			case 14->{
			    System.out.print("Enter GalleryID to search gallery details: ");
			    int galleryKeyword = scanner.nextInt();
			    List<Gallery> galleries = service.searchGallerys(galleryKeyword);
			    //checks if the gallery is empty or not
			    if (galleries.isEmpty()) {
			        System.out.println("No galleries found for the keyword: " + galleryKeyword);
			    } else {
			        System.out.println("Search Results:");
			        for (Gallery g : galleries) {
			            System.out.println("-> GalleryID :" + g.getGalleryID() + ", Gallery Name : " + g.getName() + ", Description : " 
			                + g.getDescription() + ", Location :  " + g.getLocation() + ", OpeningHours : " + g.getOpeningHours() + ", CuratorID : " + g.getCuratorID());
			        }
			    }
			    break;	
			}
			//case 15 used to view the artist details in the artist table by the artist ID
			case 15->{
			    System.out.print("Enter ArtistID to view details: ");
			    int keyword1 = scanner.nextInt();
			    List<Artist> results = service.viewArtist(keyword1);
			    
			    if (results.isEmpty()) {
			        System.out.println("No artist found: " + keyword1);
			    } else {
			        System.out.println("Search Results:");
			        for (Artist a : results) {
			            System.out.println("-> ArtistID : " + a.getArtistID() + ", Name : " + a.getName() + ", Biography : " + a.getBiography() + ", BirthDate : " +a.getBirthDate() + ", Nationality : " + a.getNationality() + ", Website : " +a.getWebsite() + ", Contact Details : " +a.getContactInformation());
			        }
			    }
			    break;
			}
			//case 16 used to view the user details in the user table by the user ID
			case 16->{
			    System.out.print("Enter UserID to view details: ");
			    int keyword2 = scanner.nextInt();
			    List<User> results = service.viewUser(keyword2);
			    
			    if (results.isEmpty()) {
			        System.out.println("No artworks found for the keyword: " + keyword2);
			    } else {
			        System.out.println("Search Results:");
			        for (User a1 : results) {
			            System.out.println("-> UserID : " + a1.getUserID() + ", UserName : " + a1.getUsername() + ", Password : " + a1.getPassword() + ", Email :"+a1.getEmail() +", FirstName : " +a1.getFirstName() + ", LastName :" +a1.getLastName() + ", Date of Birth : " +a1.getDateOfBirth() + ", Profile Link : " + a1.getProfilePicture());
			        }
			    }
			    break;
			}
			
			case 0->{
				System.out.println("=================================");
				System.out.println("---Exiting Virtual Art Gallery---");
				System.out.println("---------------------------------");
				System.out.println("-----------GOOD BYE!!!-----------");
				System.out.println("-----------Thanking You----------");
				break;
			}
			//default statement will print if the choice entered by the user is invalid
			default->{
				System.out.println("Invalid choice. Please Try again.");
			}
		}//goes till the user enter zero
		} while (choice != 0);
		scanner.close();
	}
}
}
