package org.pragma.foodcourtmessaging.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class MessageRequest{

    private String phoneNumber;
    private String message;

}
