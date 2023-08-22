package org.pragma.foodcourtmessaging.application.handler;
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
        return iMessageServicePort.sendMessage(messageRequestMapper.toMessage(messageRequest));
    }


}
