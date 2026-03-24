package edu.norcocollege.cis18b.weekx.mini04;
// ---------------------------------------------------------------
// Reusing the same Alert.java essentially from the last part (i.e, mini03)
// ---------------------------------------------------------------
public class Alert 
{
    private int id;
    private String message;
    private AlertLevel level;

    public Alert(int id, String message, AlertLevel level) 
    {
        this.id = id;
        this.message = message;
        this.level = level;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public AlertLevel getLevel() { return level; }
    public void setLevel(AlertLevel level) { this.level = level; }
}