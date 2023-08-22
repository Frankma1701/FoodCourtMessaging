package org.pragma.foodcourtmessaging.application.dto.request;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageRequestTest{

    @Test
    void shouldGetPhoneNumber() {
        String phoneNumber = "1234567890";
        String message = "Hello";
        MessageRequest messageRequest = new MessageRequest(phoneNumber, message);
        String result = messageRequest.getPhoneNumber();
        assertEquals(phoneNumber, result);
    }

    @Test
    void shouldGetMessage() {
        String phoneNumber = "1234567890";
        String message = "Hello";
        MessageRequest messageRequest = new MessageRequest(phoneNumber, message);
        String result = messageRequest.getMessage();
        assertEquals(message, result);
    }
}