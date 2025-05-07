package com.jm.email_microservice.core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);

}
