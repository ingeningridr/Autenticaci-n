package com.example.springboot.telefonia.response;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class LostCalls {


    protected String start_name;
    protected String service_name;
    protected int phone_number;

    public LostCalls(String start_name, String service_name, int phone_number ){

        this.start_name = String.valueOf(start_name);
        this.service_name = service_name;
        this.phone_number = phone_number;
    }
    public void setLostCalls(LostCalls lostcalls) {
    }
    public LostCalls() {

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

    public int getPhone_number() {

        return phone_number;
    }

    public void setPhone_number(int phone_number) {

        this.phone_number = phone_number;
    }
    @Override
    public String toString() {
        return "LostCalls[start_name=" + start_name + ",service_name=" + service_name + ",phone_number=" + phone_number + "]";
    }


}
