package com.jm.email_microservice.core;

public record EmailRequest(String to, String subject , String body) {
}
