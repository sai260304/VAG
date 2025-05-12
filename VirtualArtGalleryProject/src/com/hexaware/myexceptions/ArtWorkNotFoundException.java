//package initialization
package com.hexaware.myexceptions;
/*created by Sai Siddarth T S*/
//creation of artwork not found exception class which will extends the runtime exception
public class ArtWorkNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ArtWorkNotFoundException(String message) {
        super("Artwork not found:" + message);
    }
}