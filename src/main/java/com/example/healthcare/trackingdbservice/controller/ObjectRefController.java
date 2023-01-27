package com.example.healthcare.trackingdbservice.controller;

import com.example.healthcare.trackingdbservice.model.ObjectRefRequest;
import com.example.healthcare.trackingdbservice.model.ObjectRefResponse;
import com.example.healthcare.trackingdbservice.model.PatchObjectRef;
import com.example.healthcare.trackingdbservice.service.ObjectRefService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "ObjectRef", description = "ObjectRef")
@RestController
@RequestMapping("v1")
public class ObjectRefController {
    private final ObjectRefService objectRefService;

    public ObjectRefController(ObjectRefService objectRefService) {
        this.objectRefService = objectRefService;
    }

    @ApiResponse(responseCode = "200", description = "Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/object-refs",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ObjectRefResponse> createObjectRef(@RequestBody ObjectRefRequest objectRefRequest){
        ObjectRefResponse objectRefResponse=objectRefService.createObjectRef(objectRefRequest);
        return new ResponseEntity<>(objectRefResponse, HttpStatus.CREATED);
    }

    @ApiResponse(responseCode = "200", description = "Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")
    @ResponseStatus(value = HttpStatus.OK)
    @PatchMapping(path = "/object-refs/{refId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ObjectRefResponse> patchObjectRefById(@RequestBody PatchObjectRef patchObjectRef, @PathVariable Long refId) {
        objectRefService.patchObjectRefById(patchObjectRef, refId);
        return ResponseEntity.ok().build();
    }


}
