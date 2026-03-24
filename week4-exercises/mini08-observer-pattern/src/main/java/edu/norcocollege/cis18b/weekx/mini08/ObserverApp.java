package edu.norcocollege.cis18b.weekx.mini08;

public class ObserverApp 
{
    public static void main(String[] args) 
    {
        AlertService service = new AlertService();

        // Register multiple observers
        service.addObserver(new EmailAlertObserver());
        service.addObserver(new LogAlertObserver());

        // Process one alert and notify all observers
        Alert alert = new Alert(1, "CPU temperature critical", AlertLevel.CRITICAL);
        service.processAlert(alert);
    }
}

// This program should demonstrate the Observer pattern by allowing multiple
// listeners to respond when an alert is processed. The AlertService
// notifies each registered observer like an email notifier and
// a logger. 

// The program was able to run and test successfully with the terminal commands:
/*
mvn -f week4-exercises/mini08-observer-pattern/pom.xml clean compile
mvn -f week4-exercises/mini08-observer-pattern/pom.xml exec:java
*/

// Example output:
/*
[INFO] [stdout] Processing alert: CPU temperature critical
[INFO] [stdout] Email notification sent for alert: CPU temperature critical
[INFO] [stdout] Log entry created for alert: CPU temperature critical
*/