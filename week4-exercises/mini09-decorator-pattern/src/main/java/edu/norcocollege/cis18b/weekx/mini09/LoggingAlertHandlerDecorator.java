package edu.norcocollege.cis18b.weekx.mini09;

public class LoggingAlertHandlerDecorator implements AlertHandler 
{
    private final AlertHandler wrapped;

    public LoggingAlertHandlerDecorator(AlertHandler wrapped) 
    {
        this.wrapped = wrapped;
    }

    @Override
    public void handle(Alert alert) 
    {
        // Log before delegating to the wrapped handler
        System.out.println("Starting alert handling for: " + alert.message());

        // Delegate to the wrapped handler
        wrapped.handle(alert);

        // Log after the wrapped handler finishes
        System.out.println("Finished alert handling for: " + alert.message());
    }
}