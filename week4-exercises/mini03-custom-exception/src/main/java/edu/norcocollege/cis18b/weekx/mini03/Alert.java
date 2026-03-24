package edu.norcocollege.cis18b.weekx.mini03;

// Represents an alert with an id, message, and also a severity level
public class Alert 
{
    private int id;
    private String message;
    private AlertLevel level;

    // Constructor that initializes all alert fields
    public Alert(int id, String message, AlertLevel level) 
    {
        this.id = id;
        this.message = message;
        this.level = level;
    }

    // Getter and setter for id
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    // Getter and setter for message
    public String getMessage() 
    {
        return message;
    }

    public void setMessage(String message) 
    {
        this.message = message;
    }

    // Getter and setter for level
    public AlertLevel getLevel() 
    {
        return level;
    }

    public void setLevel(AlertLevel level) 
    {
        this.level = level;
    }
}