package org.pragma.foodcourtmessaging.infrastructure.configuration;

import lombok.RequiredArgsConstructor;
import org.pragma.foodcourtmessaging.domain.api.IMessageServicePort;
import org.pragma.foodcourtmessaging.domain.spi.IMessagePersistencePort;
import org.pragma.foodcourtmessaging.domain.usecase.MessageUseCase;
import org.pragma.foodcourtmessaging.infrastructure.output.TwiloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration{


    @Bean
    public IMessagePersistencePort messagePersistencePort(){
        return new TwiloService();
    }

    @Bean
    public IMessageServicePort messageServicePort (){
        return new MessageUseCase(messagePersistencePort());
    }
}