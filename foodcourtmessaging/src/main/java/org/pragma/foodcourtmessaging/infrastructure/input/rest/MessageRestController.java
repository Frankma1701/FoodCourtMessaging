package org.pragma.foodcourtmessaging.infrastructure.input.rest;

import lombok.RequiredArgsConstructor;
import org.pragma.foodcourtmessaging.application.dto.request.MessageRequest;
import org.pragma.foodcourtmessaging.application.handler.MessageHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageRestController{

    private final MessageHandler messageHandler;


    @PostMapping(value = "/")
    public ResponseEntity<String> sendSMS(@RequestBody MessageRequest messageRequest) {
        messageHandler.sendMessage(messageRequest);
        return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
    }






}
