package org.pragma.foodcourtmessaging.domain.model;

public class MessageNotification{

    private String phoneNumber;
    private String message;

    public MessageNotification (String phoneNumber, String message){
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getPhoneNumber (){
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getMessage (){
        return message;
    }

    public void setMessage (String message){
        this.message = message;
    }
}
