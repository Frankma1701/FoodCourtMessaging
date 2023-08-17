package org.pragma.foodcourtmessaging.infrastructure.output;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;
import org.pragma.foodcourtmessaging.domain.spi.IMessagePersistencePort;

public class TwiloService implements IMessagePersistencePort{
    @Override
    public MessageNotification sendMessage (MessageNotification message){
        Twilio.init("AC08c58450018c11e9158d0fccb08749af","e44c4d1d9870f69e616ab2646c4b2de2" );
        Message.creator(new PhoneNumber(message.getPhoneNumber()),
                new PhoneNumber("+18143348092"),
                message.getMessage()).create();
        return message;
    }
}
