package edu.norcocollege.cis18b.weekx.mini03;

// Custom checked exception used for invalid alert data
public class InvalidAlertException extends Exception 
{

    // Passes the custom error message to the Exception superclass
    public InvalidAlertException(String message) 
    {
        super(message);
    }
}