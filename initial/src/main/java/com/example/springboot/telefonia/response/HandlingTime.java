package com.example.springboot.telefonia.response;


public class HandlingTime {

    private String start_name;
    private String service_name;
    private double num_calls_answered;
    private String handling_time;
    private String average_handling_time;
    private String talk_time_in;
    private String average_talk_time_in;

    public HandlingTime(String start_name, String service_name, double num_calls_answered, String handling_time,
                        String average_handling_time, String talk_time_in, String average_talk_time_in ){

        this.start_name = String.valueOf(start_name);
        this.service_name = service_name;
        this.num_calls_answered = num_calls_answered;
        this.handling_time = String.valueOf(handling_time);
        this.average_handling_time = String.valueOf(average_handling_time);
        this.talk_time_in = String.valueOf(talk_time_in);
        this.average_talk_time_in = String.valueOf(average_talk_time_in);
    }

    public HandlingTime() {

    }

    public HandlingTime(String s) {
    }

    public String getStart_name() {

        return start_name;
    }

    public void setStart_name(String start_name) {

        this.start_name = start_name;
    }

    public String getService_name() {

        return service_name;
    }

    public void setService_name(String service_name) {

        this.service_name = service_name;
    }

    public double getNum_calls_answered() {

        return num_calls_answered;
    }

    public void setNum_calls_answered(double num_calls_answered) {

        this.num_calls_answered = num_calls_answered;
    }

    public String getHandling_time() {

        return handling_time;
    }

    public void setHandling_time(String handling_time) {

        this.handling_time = handling_time;
    }

    public String getAverage_handling_time() {

        return average_handling_time;
    }

    public void setAverage_handling_time(String average_handling_time) {
        this.average_handling_time = average_handling_time;
    }

    public String getTalk_time_in() {

        return talk_time_in;
    }

    public void setTalk_time_in(String talk_time_in) {

        this.talk_time_in = talk_time_in;
    }

    public String getAverage_talk_time_in() {

        return average_talk_time_in;
    }

    public void setAverage_talk_time_in(String average_talk_time_in) {

        this.average_talk_time_in = average_talk_time_in;
    }

    public void setToken(String token) {

    }
    public void setHandlingTime(String handlingTimename) {

    }

    @Override
    public String toString() {
        return "HandlingTime [start_name=" + start_name + ",service_name=" + service_name + ", num_calls_answered=" + num_calls_answered + ", " +
       "handling_time=" + handling_time + ", average_handling_time=" + average_handling_time +", talk_time_in=" + talk_time_in +",average_talk_time_in=" + average_talk_time_in +"]";
    }

}

