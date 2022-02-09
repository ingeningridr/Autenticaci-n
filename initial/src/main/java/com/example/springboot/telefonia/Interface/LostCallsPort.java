package com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

public interface LostCallsPort{

    boolean LostCallsPort(LostCallsPort lostCallsPort) throws Exception;

    boolean sendLostCalls(LostCallsPort LostCallsBody) throws Exception;
}
