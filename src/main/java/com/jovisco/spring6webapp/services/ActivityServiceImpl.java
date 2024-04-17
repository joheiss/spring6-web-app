package com.jovisco.spring6webapp.services;

import org.springframework.stereotype.Service;

import com.jovisco.spring6webapp.domain.Activity;
import com.jovisco.spring6webapp.repositories.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;


    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public Iterable<Activity> findAll() {
        return activityRepository.findAll();
    }
    
}
