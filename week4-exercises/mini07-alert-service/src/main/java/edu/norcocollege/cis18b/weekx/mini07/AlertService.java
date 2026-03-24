package edu.norcocollege.cis18b.weekx.mini07;

// Service layer responsible for coordinating validation and the storage of alerts
public class AlertService 
{
    private final AlertRepository repository;
    private final AlertValidator validator;

    public AlertService(AlertRepository repository) 
    {
        this.repository = repository;
        this.validator = new AlertValidator();
    }

    public void processAlert(Alert alert)
            throws InvalidAlertException, AlertStorageException, AlertProcessingException 
        {
        try 
        {
            // Validate the alert before processing
            validator.validate(alert);

            // Save the alert using the repository
            repository.save(alert);

        } catch (InvalidAlertException | AlertStorageException ex) 
        {
            // Propagate known exceptions directly
            throw ex;

        } catch (Exception ex) 
        {
            // Wrap unexpected errors in a processing exception
            throw new AlertProcessingException("Unexpected error while processing alert.", ex);
        }
    }
}