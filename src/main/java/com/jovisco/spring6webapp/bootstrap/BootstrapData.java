package com.jovisco.spring6webapp.bootstrap;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jovisco.spring6webapp.domain.Activity;
import com.jovisco.spring6webapp.domain.ActivityUser;
import com.jovisco.spring6webapp.repositories.ActivityRepository;
import com.jovisco.spring6webapp.repositories.ActivityUserRepository;

@Component
public class BootstrapData implements CommandLineRunner{

    private final ActivityUserRepository userRepository;
    private final ActivityRepository activityRepository;

    
    public BootstrapData(ActivityUserRepository userRepository, ActivityRepository activityRepository) {
        this.userRepository = userRepository;
        this.activityRepository = activityRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        ActivityUser jo = new ActivityUser();
        jo.setName("jo");
        jo.setFirstName("Jo");
        jo.setLastName("Heiss");
        jo.setRoles(Arrays.asList("user"));
        
        ActivityUser joSaved = userRepository.save(jo);

        Activity activity1 = new Activity();
        activity1.setTime(Instant.now());
        activity1.setTitle("Treadmill 4");
        activity1.setDistance(12.34);
        activity1.setDistanceUoM("km");
        activity1.setDuration(45);
        activity1.setDurationUoM("min");
        activity1.setWeight(76);
        activity1.setWeightUoM("kg");
        activity1.setActivityUser(joSaved);

        Activity activity1Saved = activityRepository.save(activity1);

        joSaved.getActivities().add(activity1Saved);

        Activity activity2 = new Activity();
        activity2.setTime(Instant.now());
        activity2.setTitle("Treadmill 4");
        activity2.setDistance(9.87);
        activity2.setDistanceUoM("km");
        activity2.setDuration(41);
        activity2.setDurationUoM("min");
        activity2.setWeight(77);
        activity2.setWeightUoM("kg");
        activity2.setActivityUser(joSaved);

        Activity activity2Saved = activityRepository.save(activity2);

        joSaved.getActivities().add(activity2Saved);

        userRepository.save(joSaved);

        System.out.println("*** Bootstrapping -> Repositories ***");
        System.out.println("User count: " + userRepository.count());
        System.out.println("Activity count: " + activityRepository.count());

    }
    
}
