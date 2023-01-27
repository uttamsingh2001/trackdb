package com.example.healthcare.trackingdbservice.controller;

import com.example.healthcare.trackingdbservice.model.ActivityRequest;
import com.example.healthcare.trackingdbservice.model.ActivityResponse;

import com.example.healthcare.trackingdbservice.service.ActivityService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1")
public class ActivityController {
    private final ActivityService activityService;
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @ApiResponse(responseCode = "200", description = "Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/activities",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ActivityResponse> createActivities(@RequestBody ActivityRequest activityRequest){
        ActivityResponse activityResponse=activityService.createActivities(activityRequest);
        return new ResponseEntity<>(activityResponse, HttpStatus.CREATED);
    }

    @ApiResponse(responseCode = "207", description = "Multi Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")
    @PutMapping(path="/activities/{activityId}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateActivities(@PathVariable Long activityId,@RequestBody ActivityRequest activityRequest)
    {
        activityService.updateActivities(activityId,activityRequest);
        return ResponseEntity.ok().build();
    }


}
