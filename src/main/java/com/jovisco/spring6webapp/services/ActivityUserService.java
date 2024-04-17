package com.jovisco.spring6webapp.services;

import com.jovisco.spring6webapp.domain.ActivityUser;

public interface ActivityUserService {
    Iterable<ActivityUser> findAll();
}
