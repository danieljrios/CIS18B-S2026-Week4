package edu.norcocollege.cis18b.weekx.mini10;

// Validates alert data before processing
public class AlertValidator {
    public void validate(Alert alert) throws InvalidAlertException 
    {
        // Ensure alert is not null
        if (alert == null) {
            throw new InvalidAlertException("Alert cannot be null.");
        }

        // Ensure message is not null or blank
        if (alert.message() == null || alert.message().isBlank()) 
        {
            throw new InvalidAlertException("Message cannot be null or blank.");
        }

        // Ensure level is provided
        if (alert.level() == null) 
        {
            throw new InvalidAlertException("Level cannot be null.");
        }
    }
}