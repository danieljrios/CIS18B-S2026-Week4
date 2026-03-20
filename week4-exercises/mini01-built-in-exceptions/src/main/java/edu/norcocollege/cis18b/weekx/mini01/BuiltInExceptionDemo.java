package edu.norcocollege.cis18b.weekx.mini01;

public class BuiltInExceptionDemo 
{
    public static void main(String[] args) 
    {

        // Initialize values for demonstration
        int numerator = 10;
        int denominator = 0;

        // Array representing system alerts
        String[] alerts = {"CPU High", "Disk Full", "Login Failure"};

        // ---------------------------------------
        // Example 1: Handling ArithmeticException
        // ---------------------------------------
        // This try block will attempt to divide by zero,
        // which will throw an ArithmeticException
        try 
        {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) 
        {
            // Catch block prevents program crash & displays a message to user
            System.out.println("Cannot divide by zero.");
        }

        // -------------------------------------------------
        // Example 2: Handling ArrayIndexOutOfBoundsException
        // -------------------------------------------------
        // This try block intentionally accesses an invalid index
        // to demonstrate handling array bounds errors:
        try {
            System.out.println(alerts[5]); // invalid index (b/c array only has 0–2)
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            // Catch block handles invalid index access
            System.out.println("Invalid alert index.");
        }

        // Final message to show program continues after exceptions
        System.out.println("Program completed.");
    }
}