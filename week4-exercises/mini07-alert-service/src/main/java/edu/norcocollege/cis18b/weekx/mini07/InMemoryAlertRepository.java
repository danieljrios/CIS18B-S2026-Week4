package edu.norcocollege.cis18b.weekx.mini07;

import java.util.ArrayList;
import java.util.List;

// Simulates storing alerts in memory
public class InMemoryAlertRepository implements AlertRepository 
{
    private final List<Alert> alerts = new ArrayList<>();

    @Override
    public void save(Alert alert) throws AlertStorageException 
    {
        try 
        {
            // Add alert to in-memory list
            alerts.add(alert);

        } catch (RuntimeException ex) 
        {
            // Translate low-level failure into storage exception
            throw new AlertStorageException("Failed to save alert.", ex);
        }
    }

    public List<Alert> findAll() 
    {
        return new ArrayList<>(alerts);
    }
}