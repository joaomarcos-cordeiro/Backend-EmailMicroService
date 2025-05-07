package com.jm.email_microservice.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
