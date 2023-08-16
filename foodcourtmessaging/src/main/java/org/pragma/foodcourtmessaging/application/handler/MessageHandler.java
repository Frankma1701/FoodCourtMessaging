package org.pragma.foodcourtmessaging.application.handler;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.RequiredArgsConstructor;
import org.pragma.foodcourtmessaging.application.dto.request.MessageRequest;
import org.pragma.foodcourtmessaging.application.mapper.request.MessageRequestMapper;
import org.pragma.foodcourtmessaging.domain.api.IMessageServicePort;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageHandler implements IMessageHandler{

    private final IMessageServicePort iMessageServicePort;
    private final MessageRequestMapper messageRequestMapper;

    @Override
    public MessageNotification sendMessage (MessageRequest messageRequest){
        MessageNotification message = iMessageServicePort.sendMessage(messageRequestMapper.toMessage(messageRequest));
        return message;
    }
}
