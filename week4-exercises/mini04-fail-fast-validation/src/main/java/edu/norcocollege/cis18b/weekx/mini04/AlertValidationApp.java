package edu.norcocollege.cis18b.weekx.mini04;

// --------------------------------------------------------------------
// Demonstrates fail-fast validation by immediately checking alert data
// and throwing a custom exception if it's invalid. Validation here is
// separated into its own class like the README suggests for us.
// --------------------------------------------------------------------
public class AlertValidationApp 
{
    // Create one valid alert and one invalid alert for demonstration
    public static void main(String[] args) 
    {
        // Valid alert
        Alert validAlert = new Alert(1, "System OK", AlertLevel.INFO);

        // Invalid alert (blank message + null level)
        Alert invalidAlert = new Alert(2, "", null);

        // Test valid alert
        try 
        {
            AlertValidator.validate(validAlert);
            System.out.println("Valid alert passed validation.");
        } catch (InvalidAlertException e) 
        {
            System.out.println("Valid alert failed: " + e.getMessage());
        }

        // Test invalid alert
        try 
        {
            AlertValidator.validate(invalidAlert);
            System.out.println("Invalid alert passed validation.");
        } catch (InvalidAlertException e) 
        {
            System.out.println("Invalid alert: " + e.getMessage());
        }
    }
}

// Test builds and runs successfully with:
/*
mvn -f week4-exercises/mini04-fail-fast-validation/pom.xml clean compile
mvn -f week4-exercises/mini04-fail-fast-validation/pom.xml exec:java
*/