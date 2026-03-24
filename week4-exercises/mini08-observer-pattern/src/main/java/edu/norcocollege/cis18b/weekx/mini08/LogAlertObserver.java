package edu.norcocollege.cis18b.weekx.mini08;

public class LogAlertObserver implements AlertObserver 
{
    @Override
    public void onAlert(Alert alert) 
    {
        // Simulate writing the alert to a log
        System.out.println("Log entry created for alert: " + alert.message());
    }
}