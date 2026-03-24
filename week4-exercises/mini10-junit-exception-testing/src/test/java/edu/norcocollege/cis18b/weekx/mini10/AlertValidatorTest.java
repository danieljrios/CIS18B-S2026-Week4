package edu.norcocollege.cis18b.weekx.mini10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Tests for alert validation logic
public class AlertValidatorTest 
{

    @Test
    void shouldAcceptValidAlert() 
    {
        AlertValidator validator = new AlertValidator();
        Alert alert = new Alert(1, "CPU critical", AlertLevel.CRITICAL);

        // Should not throw any exception
        assertDoesNotThrow(() -> validator.validate(alert));
    }

    @Test
    void shouldRejectBlankMessage() 
    {
        AlertValidator validator = new AlertValidator();
        Alert alert = new Alert(1, "   ", AlertLevel.WARNING);

        // Expect validation exception
        assertThrows(InvalidAlertException.class, () -> validator.validate(alert));
    }

    @Test
    void shouldRejectNullLevel() 
    {
        AlertValidator validator = new AlertValidator();
        Alert alert = new Alert(1, "Disk usage high", null);

        // Expect validation exception
        assertThrows(InvalidAlertException.class, () -> validator.validate(alert));
    }
}

// Code and tests pass successfully using:
/*
mvn -f week4-exercises/mini10-junit-exception-testing/pom.xml test
*/
