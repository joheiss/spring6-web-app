package com.jovisco.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jovisco.spring6webapp.domain.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Long> {
    
}
