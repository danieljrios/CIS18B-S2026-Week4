package edu.norcocollege.cis18b.weekx.mini03;

// -- Program functionality summary: ------
// Demonstrates custom exception handling. Alerts are validated to ensure
// the message is not blank and the level is not null. If invalid data is found,
// a custom InvalidAlertException is thrown and handled in main using try/catch.
// 
// Example output exemplifies the test case for "Alert alert = new Alert(1, "", null);"
// by displaying: "Invalid alert: Message cannot be null or blank."

// So it only reports the first failure it encounters as intended.
// ----------------------------------------
public class AlertValidatorDemo
{

    public static void validateAlert(Alert alert) throws InvalidAlertException 
    {
        // Throw an exception if the message is null or only blank spaces
        if (alert.getMessage() == null || alert.getMessage().isBlank()) 
        {
            throw new InvalidAlertException("Message cannot be null or blank.");
        }

        // Throw an exception if the alert level was not provided
        if (alert.getLevel() == null) 
        {
            throw new InvalidAlertException("Level cannot be null.");
        }
    }

    public static void main(String[] args) 
    {
        // Create an invalid alert to demonstrate custom exception handling
        Alert alert = new Alert(1, "", null);

        try 
        {
            validateAlert(alert);
            System.out.println("Alert is valid.");
        } catch (InvalidAlertException ex) {
            // Display the custom validation error message
            System.out.println("Invalid alert: " + ex.getMessage());
        }
    }
}

// Program runs successfully with the commands:
/*
mvn -f /workspaces/CIS18B-S2026-Week4/week4-exercises/mini03-custom-exception/pom.xml clean compile
mvn -f /workspaces/CIS18B-S2026-Week4/week4-exercises/mini03-custom-exception/pom.xml exec:java
*/