package edu.norcocollege.cis18b.weekx.mini04;

// Validates Alert objects using fail-fast logic
public class AlertValidator {

    public static void validate(Alert alert) throws InvalidAlertException {
        // Reject a null alert immediately
        if (alert == null) {
            throw new InvalidAlertException("Alert cannot be null.");
        }

        // Reject alerts with a null or blank message
        if (alert.getMessage() == null || alert.getMessage().isBlank()) {
            throw new InvalidAlertException("Message cannot be null or blank.");
        }

        // Reject alerts that do not have a severity level
        if (alert.getLevel() == null) {
            throw new InvalidAlertException("Level cannot be null.");
        }
    }
}
public class AlertValidator 
{

    public static void validate(Alert alert) throws InvalidAlertException 
    {

        // Fail fast if alert itself is null
        if (alert == null) 
        {
            throw new InvalidAlertException("Alert cannot be null.");
        }

        // Fail fast if message is invalid
        if (alert.getMessage() == null || alert.getMessage().isBlank()) 
        {
            throw new InvalidAlertException("Message cannot be null or blank.");
        }

        // Fail fast if level is missing
        if (alert.getLevel() == null) 
        {
            throw new InvalidAlertException("Level cannot be null.");
        }
    }
}