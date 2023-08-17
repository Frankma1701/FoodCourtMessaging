package org.pragma.foodcourtmessaging.infrastructure.output;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;
import org.pragma.foodcourtmessaging.domain.spi.IMessagePersistencePort;
import org.springframework.beans.factory.annotation.Value;

public class TwiloService implements IMessagePersistencePort{

    @Value("${twilo.account-sid}")
    private String ACCOUNT_SID;

    @Value("${twilo.auth-token}")
    private String AUTH_TOKEN;

    @Value("${twilo.phone}")
    private String PHONE;
    @Override
    public MessageNotification sendMessage (MessageNotification message){
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN );
        Message.creator(new PhoneNumber(message.getPhoneNumber()),
                new PhoneNumber(PHONE),
                message.getMessage()).create();
        return message;
    }
}
