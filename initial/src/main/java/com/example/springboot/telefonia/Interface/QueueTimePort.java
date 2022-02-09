package com.example.springboot.telefonia.Interface;

//import javax.telefonia.MessagingException;

public interface QueueTimePort {

    boolean QueueTimePort(QueueTimePort queueTimePort) throws Exception;

    boolean sendQueueTime(QueueTimePort queueTimeBody) throws Exception;
}

