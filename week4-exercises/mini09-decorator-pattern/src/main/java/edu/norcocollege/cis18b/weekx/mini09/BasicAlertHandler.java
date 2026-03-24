package edu.norcocollege.cis18b.weekx.mini09;

public class BasicAlertHandler implements AlertHandler 
{
    @Override
    public void handle(Alert alert) 
    {
        // Print a simple message showing the alert is being handled
        System.out.println("Handling alert: " + alert.message());
    }
}