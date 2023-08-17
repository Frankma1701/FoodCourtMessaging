package org.pragma.foodcourtmessaging.domain.usecase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;
import org.pragma.foodcourtmessaging.domain.spi.IMessagePersistencePort;

import static org.junit.jupiter.api.Assertions.*;

class MessageUseCaseTest{
    @Mock
    private IMessagePersistencePort messagePersistencePort;
    @InjectMocks
    private MessageUseCase messageUseCase;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testSendMessage() {
        MessageNotification testMessage = new MessageNotification("+584214","Mensaje de prueba");
        Mockito.when(messagePersistencePort.sendMessage(Mockito.any(MessageNotification.class)))
                .thenReturn(testMessage);
        MessageNotification result = messageUseCase.sendMessage(testMessage);
        assertEquals(testMessage, result);
    }
}