package edu.norcocollege.cis18b.weekx.mini02;

public class FinallyDemo 
{
    public static void main(String[] args) 
    {
        // Simulate opening a resource before processing alerts
        System.out.println("Opening alert stream...");

        try 
        {
            // Intentionally throw a runtime exception to demonstrate error handling
            throw new RuntimeException("Alert stream interrupted.");
        } catch (RuntimeException ex) {
            // Print the exception message in a friendly format
            System.out.println("Error: " + ex.getMessage());
        } finally 
        {
            // This block always runs, even if an exception occurs
            System.out.println("Closing alert stream...");
        }
    }
}