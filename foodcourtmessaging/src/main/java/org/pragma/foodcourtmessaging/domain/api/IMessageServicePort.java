package org.pragma.foodcourtmessaging.domain.api;

import org.pragma.foodcourtmessaging.domain.model.MessageNotification;

public interface IMessageServicePort{

    MessageNotification sendMessage(MessageNotification message);

}
