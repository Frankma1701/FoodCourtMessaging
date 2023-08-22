package org.pragma.foodcourtmessaging.domain.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)

class MessageNotificationTest{

    @Test
    void setPhoneNumber() {
        String phoneNumber = "1234567890";
        String message = "Hello, World!";
        MessageNotification notification = new MessageNotification(phoneNumber, message);
        notification.setPhoneNumber("9876543210");
        assertEquals(notification.getPhoneNumber(),"9876543210");
    }

    @Test
    void setMessage() {
        String phoneNumber = "1234567890";
        String message = "Hello, World!";
        MessageNotification notification = new MessageNotification(phoneNumber, message);
        notification.setMessage("New message");
        assertEquals(notification.getMessage(),"New message");
    }

}