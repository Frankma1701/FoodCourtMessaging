package org.pragma.foodcourtmessaging.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class MessageRequest{

    private String phoneNumber;
    private String message;
}
