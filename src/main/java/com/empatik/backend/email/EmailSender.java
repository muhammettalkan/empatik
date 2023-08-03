package com.empatik.backend.email;

public interface EmailSender {

    void send(String to, String email);
}
