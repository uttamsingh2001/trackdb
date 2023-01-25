package com.example.healthcare.shareddataservice.controller;

import com.example.healthcare.shareddataservice.model.MessageRequest;
import com.example.healthcare.shareddataservice.model.MessageResponse;
import com.example.healthcare.shareddataservice.service.MessageService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {
    private final MessageService messageService;
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @ApiResponse(responseCode = "200", description = "Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")

    @PostMapping("/v1/messages")
    public ResponseEntity<MessageResponse> createMessage(@RequestBody MessageRequest messageRequest)
    {
        MessageResponse messageResponse=messageService.createMessage(messageRequest);
        return new ResponseEntity<>(messageResponse, HttpStatus.CREATED);
    }

    @PutMapping("/v1/messages/{messageGuid}")
    public ResponseEntity<MessageRequest> updateMessage(@PathVariable String messageGuid, @RequestBody MessageRequest messageRequest)
    {
        MessageRequest messageRequest1=messageService.updateMessage(messageGuid,messageRequest);
        return new ResponseEntity<>(messageRequest1,HttpStatus.OK);
    }


}
