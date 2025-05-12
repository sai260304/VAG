//initialization of package my exceptions 
package com.hexaware.myexceptions;
/*created by Sai Siddarth T S*/
//creation of user not found exception class which will extends the runtime exception
public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
        super("User Not Found Error: " + message);
    }
}