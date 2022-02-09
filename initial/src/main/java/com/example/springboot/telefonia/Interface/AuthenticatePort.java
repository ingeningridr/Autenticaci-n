package com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

public interface AuthenticatePort {

    boolean AuthenticatePort(AuthenticatePort authenticatePort) throws Exception;

    boolean sendAuthenticate(AuthenticatePort authenticateBody) throws Exception;
}

