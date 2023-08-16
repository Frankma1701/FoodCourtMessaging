package org.pragma.foodcourtmessaging.application.handler;

import org.pragma.foodcourtmessaging.application.dto.request.MessageRequest;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;
public interface IMessageHandler{

    MessageNotification sendMessage(MessageRequest messageRequest);



}
