package org.pragma.foodcourtmessaging.domain.spi;

import org.pragma.foodcourtmessaging.domain.model.MessageNotification;

public interface IMessagePersistencePort{
    MessageNotification sendMessage(MessageNotification message);



}
