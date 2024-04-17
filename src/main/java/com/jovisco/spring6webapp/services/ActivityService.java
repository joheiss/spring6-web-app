package com.jovisco.spring6webapp.services;

import com.jovisco.spring6webapp.domain.Activity;

public interface ActivityService {
    Iterable<Activity> findAll();
}
