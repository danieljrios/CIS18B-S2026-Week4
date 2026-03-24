package edu.norcocollege.cis18b.weekx.mini10;

// Service class that coordinates validation and storage of alerts
public class AlertService 
{
    private final AlertRepository repository;
    private final AlertValidator validator = new AlertValidator();

    public AlertService(AlertRepository repository) 
    {
        this.repository = repository;
    }

    public void processAlert(Alert alert) throws InvalidAlertException, AlertStorageException {
        // Validate the alert before saving
        validator.validate(alert);

        // Save the alert through the repository
        repository.save(alert);
    }

    // Returns the number of stored alerts
    public int getAlertCount() 
    {
        return repository.findAll().size();
    }
}