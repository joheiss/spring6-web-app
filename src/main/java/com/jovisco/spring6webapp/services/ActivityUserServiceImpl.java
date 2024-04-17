package com.jovisco.spring6webapp.services;

import org.springframework.stereotype.Service;

import com.jovisco.spring6webapp.domain.ActivityUser;
import com.jovisco.spring6webapp.repositories.ActivityUserRepository;

@Service
public class ActivityUserServiceImpl implements ActivityUserService {

    private final ActivityUserRepository activityUserRepository;
    
    public ActivityUserServiceImpl(ActivityUserRepository activityUserRepository) {
        this.activityUserRepository = activityUserRepository;
    }

    @Override
    public Iterable<ActivityUser> findAll() {

        return activityUserRepository.findAll();
    }
    
}
