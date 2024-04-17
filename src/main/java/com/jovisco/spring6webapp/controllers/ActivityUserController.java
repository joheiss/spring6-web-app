package com.jovisco.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jovisco.spring6webapp.services.ActivityUserService;

@Controller
public class ActivityUserController {

    private final ActivityUserService activityUserService;

    public ActivityUserController(ActivityUserService activityUserService) {
        this.activityUserService = activityUserService;
    }

    @GetMapping("/activityUsers")
    public String getUsers(Model model) {
        model.addAttribute("activityUsers", activityUserService.findAll());

        return "activityUsers";
    }
    
}
