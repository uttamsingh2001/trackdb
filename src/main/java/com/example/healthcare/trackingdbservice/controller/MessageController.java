package com.example.healthcare.trackingdbservice.controller;

import com.example.healthcare.trackingdbservice.model.MessageRequest;
import com.example.healthcare.trackingdbservice.model.MessageResponse;
import com.example.healthcare.trackingdbservice.service.MessageService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Tag(name = "Message", description = "Message")
@RestController
@RequestMapping("v1")
public class MessageController {
    private final MessageService messageService;
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @ApiResponse(responseCode = "200", description = "Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/messages", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageResponse> createMessage(@RequestBody MessageRequest messageRequest)
    {
        MessageResponse messageResponse=messageService.createMessage(messageRequest);
        return new ResponseEntity<>(messageResponse, HttpStatus.CREATED);
    }

    @ApiResponse(responseCode = "207", description = "Multi Success")
    @ApiResponse(responseCode = "400", description = "Invalid request")
    @ApiResponse(responseCode = "404", description = "Not found")
    @ApiResponse(responseCode = "500", description = "System Error")
    @PutMapping(path = "/messages/{messageGuid}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MessageRequest> updateMessage(@PathVariable String messageGuid, @RequestBody MessageRequest messageRequest)
    {
        MessageRequest messageRequest1=messageService.updateMessage(messageGuid,messageRequest);
        return new ResponseEntity<>(messageRequest1,HttpStatus.OK);
    }


}
