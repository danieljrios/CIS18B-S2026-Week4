package edu.norcocollege.cis18b.weekx.mini08;

public class EmailAlertObserver implements AlertObserver 
{
    @Override
    public void onAlert(Alert alert) 
    {
        // Simulate sending an email notification
        System.out.println("Email notification sent for alert: " + alert.message());
    }
}