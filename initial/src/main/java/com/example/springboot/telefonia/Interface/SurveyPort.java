package com.example.springboot.telefonia.Interface;

//import javax.calls.MessagingException;

public interface SurveyPort {

    boolean SurveyPort(SurveyPort surveyPort) throws Exception;

    boolean sendSurvey(QueueTimePort SurveyBody) throws Exception;
}