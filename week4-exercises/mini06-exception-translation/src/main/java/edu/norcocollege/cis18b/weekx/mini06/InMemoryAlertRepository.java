package edu.norcocollege.cis18b.weekx.mini06;

// Preserving the rest of the code because it wasn't really needed to be changed.

// Program shows exception translation by catching a low-level
// storage failure and wrapping it in a custom AlertStorageException.
// The original cause is preserved so the application can report a
// a user-friendly message and the underlying problem.

public class InMemoryAlertRepository implements AlertRepository 
{
    @Override
    public void save(Alert alert) throws AlertStorageException 
    {
        try 
        {
             // Simulate a low-level storage failure
            throw new RuntimeException("Database connection failed");
        } catch (RuntimeException ex) 
        {
            // Translate the low-level exception into a domain-specific exception
            throw new AlertStorageException("Failed to save alert.", ex);
        }
    }
}

// Example output:
/* 
[stdout] Storage error: Failed to save alert.
[INFO] [stdout] Cause: Database connection failed
*/
// --- --- --- ---

// Ran and tested the code successfully with the terminal commands:
/*
mvn -f week4-exercises/mini06-exception-translation/pom.xml clean compile
mvn -f week4-exercises/mini06-exception-translation/pom.xml exec:java
*/