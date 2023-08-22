package org.pragma.foodcourtmessaging.domain.usecase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;
import org.pragma.foodcourtmessaging.domain.spi.IMessagePersistencePort;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)

class MessageUseCaseTest{
    @Mock
    private IMessagePersistencePort messagePersistencePort;
    @InjectMocks
    private MessageUseCase messageUseCase;


    @Test
    public void testSendMessage() {
        MessageNotification testMessage = new MessageNotification("+584214","Mensaje de prueba");
        Mockito.when(messagePersistencePort.sendMessage(Mockito.any(MessageNotification.class)))
                .thenReturn(testMessage);
        MessageNotification result = messageUseCase.sendMessage(testMessage);
        assertEquals(testMessage, result);
    }
}