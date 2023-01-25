package com.example.healthcare.shareddataservice.controller;

import com.example.healthcare.shareddataservice.model.ObjectRefRequest;
import com.example.healthcare.shareddataservice.model.ObjectRefResponse;
import com.example.healthcare.shareddataservice.model.PatchObjectRef;
import com.example.healthcare.shareddataservice.service.ObjectRefService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
public class ObjectRefController {
    private final ObjectRefService objectRefService;

    public ObjectRefController(ObjectRefService objectRefService) {
        this.objectRefService = objectRefService;
    }

    @PostMapping("/v1/object-refs")
    public ResponseEntity<ObjectRefResponse> createObjectRef(@RequestBody ObjectRefRequest objectRefRequest){
        ObjectRefResponse objectRefResponse=objectRefService.createObjectRef(objectRefRequest);
        return new ResponseEntity<>(objectRefResponse, HttpStatus.CREATED);
    }

    @PatchMapping(path = "/object-refs/{refid}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ObjectRefResponse> patchObjectRefById(@RequestBody PatchObjectRef patchObjectRef, @PathVariable Long refid) {
        objectRefService.patchObjectRefById(patchObjectRef, refid);
        return ResponseEntity.ok().build();
    }



//    @PatchMapping("/v1/object-refs/{objectRefID}")
//    public ResponseEntity<Void> patchObjectRef(@PathVariable Long objectRefID, Map<String, Object> fields)
//    {
//        objectRefService.patchObjectRef(objectRefID,fields);
//        return ResponseEntity.ok().build();
//
//    }

}
