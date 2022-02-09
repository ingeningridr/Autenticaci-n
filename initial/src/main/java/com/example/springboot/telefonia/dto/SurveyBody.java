package com.example.springboot.telefonia.dto;

//import com.fasterxml.jackson.annotation.JsonProperty;

public class SurveyBody {

    private String start_name;
    private String service_name;
    private int phone_number;
    private String FCR;
    private String NPS;
    private int CS;
    private String p1;
    private String p2;
    private String p3;
    private String p4;
    private String p5;
    private String p6;
    private String p7;
    private String p8;
    private String p9;

    public SurveyBody(String start_name, String service_name, int phone_number, String FCR, String NPS, int CS,
                      String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9){

        this.start_name = String.valueOf(start_name);
        this.service_name = service_name;
        this. phone_number = phone_number;
        this.FCR = FCR ;
        this.NPS = NPS;
        this.CS = CS;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.p9 = p9;
    }

    public void setSurvey(SurveyBody survey) {

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

    public String getFCR() {

        return FCR;
    }

    public void setFCR(String fcr) {

        this.FCR = fcr;
    }

    public String getNPS() {
        return NPS;
    }

    public void setNPS(String NPS) {
        this.NPS = NPS;
    }

    public int getCS() {
        return CS;
    }

    public void setCS(int CS) {

        this.CS = CS;
    }
    public String getP1() {
        return p1;
    }

    public void setP1(String P1) {

        this.p1 = p1;
    }
    public String getP2() {

        return p2;
    }

    public void setP2(String p2) {

        this.p2 = p2;
    }
    public String getP3() {

        return p3;
    }

    public void setP3(String p3) {

        this.p3 = p3;
    }
    public String getP4() {

        return p4;
    }

    public void setP4(String p4) {

        this.p4= p4;
    }
    public String getP5() {

        return p5;
    }

    public void setP5(String p5) {

        this.p5 = p5;
    }
    public String getP6() {

        return p6;
    }

    public void setP6(String p6) {

        this.p6 = p6;
    }
    public String getP7() {

        return p7;
    }

    public void setP7(String p7) {

        this.p7 = p7;
    }
    public String getP8() {

        return p8;
    }

    public void setP8(String p8) {

        this.p8 = p8;
    }
    public String getP9() {

        return p9;
    }

    public void setP9(String p9) {

        this.p9 = p9;
    }

}


