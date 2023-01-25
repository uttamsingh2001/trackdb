package com.example.healthcare.shareddataservice.controller;

import com.example.healthcare.shareddataservice.model.ActivityRequest;
import com.example.healthcare.shareddataservice.model.ActivityResponse;
import com.example.healthcare.shareddataservice.service.ActivityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActivityController {
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping("/v1/activities")
    public ResponseEntity<ActivityResponse> createActivities(@RequestBody ActivityRequest activityRequest){
        ActivityResponse activityResponse=activityService.createActivities(activityRequest);
        return new ResponseEntity<>(activityResponse, HttpStatus.CREATED);
    }

    @PutMapping("/v1/activities/{activityId}")
    public ResponseEntity<Void> updateActivities(@PathVariable Long activityId,@RequestBody ActivityRequest activityRequest)
    {
        activityService.updateActivities(activityId,activityRequest);
        return ResponseEntity.ok().build();
    }

}
