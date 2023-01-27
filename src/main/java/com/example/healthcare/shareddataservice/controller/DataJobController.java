package com.example.healthcare.shareddataservice.controller;

import com.example.healthcare.shareddataservice.model.DataJobRequest;
import com.example.healthcare.shareddataservice.model.DataJobResponse;
import com.example.healthcare.shareddataservice.service.DataJobService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1")
public class DataJobController {

    private final DataJobService dataJobService;

    public DataJobController(DataJobService dataJobService) {
        this.dataJobService = dataJobService;
    }

    @ApiResponse(responseCode = "200", description = "Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/datajobs", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DataJobResponse> createDataJob(@RequestBody DataJobRequest dataJobRequest){
        DataJobResponse dataJobResponse=dataJobService.createDataJob(dataJobRequest);
        return new ResponseEntity<>(dataJobResponse, HttpStatus.CREATED);

    }

    @ApiResponse(responseCode = "207", description = "Multi Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")
    @PutMapping(path = "/datajobs/{dataJobGuid}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateDataJob(@PathVariable String dataJobGuid, @RequestBody DataJobRequest dataJobRequest)
    {
        dataJobService.updateDataJob(dataJobGuid,dataJobRequest);
        return ResponseEntity.ok().build();

    }

 }
