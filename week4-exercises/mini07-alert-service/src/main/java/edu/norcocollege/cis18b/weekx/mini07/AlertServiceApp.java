package edu.norcocollege.cis18b.weekx.mini07;

// Added commments to understand the program.
// The mini program demonstrates a service layer that combines validation,
// storage, as well as exception handling. Alerts are validated before being saved,
// and different types of exceptions are used to communicate the errors.

// Entry point to test the alert service
public class AlertServiceApp 
{
    public static void main(String[] args) 
    {
        AlertService service = new AlertService(new InMemoryAlertRepository());

        // Creates a valid alert
        Alert alert = new Alert(1, "Unauthorized login attempt", AlertLevel.CRITICAL);

        try 
        {
            // Processes the alert through the service layer
            service.processAlert(alert);

            System.out.println("Alert processed successfully.");

        } catch (InvalidAlertException | AlertStorageException | AlertProcessingException ex) 
        {
            // Handles any errors during the processing
            System.out.println("Processing failed: " + ex.getMessage());
        }
    }
}

// Compiles are runs successfully with:
/*
mvn -f week4-exercises/mini07-alert-service/pom.xml clean compile
mvn -f week4-exercises/mini07-alert-service/pom.xml exec:java
*/