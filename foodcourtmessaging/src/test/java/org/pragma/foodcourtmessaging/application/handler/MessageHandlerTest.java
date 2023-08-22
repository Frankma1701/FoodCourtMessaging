package org.pragma.foodcourtmessaging.application.handler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.pragma.foodcourtmessaging.application.dto.request.MessageRequest;
import org.pragma.foodcourtmessaging.application.mapper.request.MessageRequestMapper;
import org.pragma.foodcourtmessaging.domain.api.IMessageServicePort;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class MessageHandlerTest{
    @Mock
    private IMessageServicePort messageServicePort;
    @Mock
    private MessageRequestMapper requestMapper;
    @InjectMocks
    private MessageHandler messageHandler;
    @Test
    void shouldSendMessage() {
        MessageRequest messageRequest = new MessageRequest("1234567890", "Hello");
        MessageNotification messageNotification = new MessageNotification("1234567890", "Hello");
        when(requestMapper.toMessage(messageRequest)).thenReturn(messageNotification);
        when(messageServicePort.sendMessage(any(MessageNotification.class))).thenReturn(messageNotification);
        MessageNotification result = messageHandler.sendMessage(messageRequest);
        assertEquals(messageNotification, result);
    }

}