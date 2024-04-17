package com.jovisco.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.jovisco.spring6webapp.services.ActivityService;

@Controller
public class ActivityController {
    
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping("/activities")
    public String getActivities(Model model) {
        model.addAttribute("activities", activityService.findAll());
        return "activities";
    }
}
