package com.example.springboot.telefonia.response;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class Calls {

    private String start_name;
    private String service_name;
    private int phone_number;

    public Calls(String start_name, String service_name, int phone_number){
         this.start_name = String.valueOf(start_name);
         this.service_name = service_name;
         this.phone_number = phone_number;

    }

    public Calls() {

    }
    public void setCalls(Calls calls) {

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
        return "Calls[start_name=" + start_name + ",service_name=" + service_name + ",phone_number=" + phone_number + "]";
    }


}
