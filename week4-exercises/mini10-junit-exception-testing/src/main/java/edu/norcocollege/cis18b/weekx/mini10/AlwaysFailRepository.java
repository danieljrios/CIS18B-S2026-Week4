package edu.norcocollege.cis18b.weekx.mini10;

import java.util.List;

// Simulates a repository that always fails when saving
public class AlwaysFailRepository implements AlertRepository 
{
    @Override
    public void save(Alert alert) throws AlertStorageException 
    {
        // Always throw an exception to simulate failure
        throw new AlertStorageException("Simulated repository failure.");
    }

    @Override
    public List<Alert> findAll() 
    {
        return List.of();
    }
}