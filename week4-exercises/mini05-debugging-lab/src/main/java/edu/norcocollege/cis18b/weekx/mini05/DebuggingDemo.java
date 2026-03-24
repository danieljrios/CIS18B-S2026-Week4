package edu.norcocollege.cis18b.weekx.mini05;

public class DebuggingDemo 
{
    public static void main(String[] args) 
    {
        String[] alerts = {"CPU High", "Disk Full", "Login Failure"};

        // FIX: Loop through each valid alert index in the array
        for (int i = 0; i < alerts.length; i++) 
        {
            System.out.println("Processing alert: " + alerts[i]);
        }
    }
}