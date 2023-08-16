package org.pragma.foodcourtmessaging.infrastructure.output;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;
import org.pragma.foodcourtmessaging.domain.spi.IMessagePersistencePort;

public class TwiloService implements IMessagePersistencePort{
    @Override
    public MessageNotification sendMessage (MessageNotification message){
        Twilio.init("AC08c58450018c11e9158d0fccb08749af","29660323ddaca062d4cb6e4e52c927b9" );

        Message.creator(new PhoneNumber(message.getPhoneNumber()),
                new PhoneNumber("+18143348092"),
                message.getMessage()).create();
        return message;
    }
}
