package org.pragma.foodcourtmessaging.domain.usecase;

import org.pragma.foodcourtmessaging.domain.api.IMessageServicePort;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;
import org.pragma.foodcourtmessaging.domain.spi.IMessagePersistencePort;

public class MessageUseCase implements IMessageServicePort{

    private final IMessagePersistencePort iMessagePersistencePort;

    public MessageUseCase (IMessagePersistencePort iMessagePersistencePort){
        this.iMessagePersistencePort = iMessagePersistencePort;
    }
    @Override
    public MessageNotification sendMessage (MessageNotification message){
        return iMessagePersistencePort.sendMessage(message);
    }
}
