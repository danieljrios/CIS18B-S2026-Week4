package edu.norcocollege.cis18b.weekx.mini09;

public class DecoratorApp 
{
    public static void main(String[] args) 
    {
        Alert alert = new Alert(1, "CPU usage exceeded threshold", AlertLevel.CRITICAL);

        // Create the basic handler
        AlertHandler basicHandler = new BasicAlertHandler();

        // Wrap it with the logging decorator
        AlertHandler loggingHandler = new LoggingAlertHandlerDecorator(basicHandler);

        // Handle the alert through the decorated handler
        loggingHandler.handle(alert);
    }
}

// Code ran and passed the tests successfully using:
/*
mvn -f week4-exercises/mini09-decorator-pattern/pom.xml clean compile
mvn -f week4-exercises/mini09-decorator-pattern/pom.xml exec:java
*/

// Example output:
/*
[INFO] [stdout] Starting alert handling for: CPU usage exceeded threshold
[INFO] [stdout] Handling alert: CPU usage exceeded threshold
[INFO] [stdout] Finished alert handling for: CPU usage exceeded threshold
*/