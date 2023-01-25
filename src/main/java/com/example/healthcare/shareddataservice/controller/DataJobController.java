package com.example.healthcare.shareddataservice.controller;

import com.example.healthcare.shareddataservice.model.DataJobRequest;
import com.example.healthcare.shareddataservice.model.DataJobResponse;
import com.example.healthcare.shareddataservice.service.DataJobService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataJobController {

    private final DataJobService dataJobService;

    public DataJobController(DataJobService dataJobService) {
        this.dataJobService = dataJobService;
    }

    @ApiResponse(responseCode = "200", description = "Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")
    @PostMapping("/v1/datajobs")
    public ResponseEntity<DataJobResponse> createDataJob(@RequestBody DataJobRequest dataJobRequest){
        DataJobResponse dataJobResponse=dataJobService.createDataJob(dataJobRequest);
        return new ResponseEntity<>(dataJobResponse, HttpStatus.CREATED);

    }

    @PutMapping("/v1/datajobs/{dataJobGuid}")
    public ResponseEntity<Void> updateDataJob(@PathVariable String dataJobGuid, @RequestBody DataJobRequest dataJobRequest)
    {
        dataJobService.updateDataJob(dataJobGuid,dataJobRequest);
        return ResponseEntity.ok().build();

    }

 }
