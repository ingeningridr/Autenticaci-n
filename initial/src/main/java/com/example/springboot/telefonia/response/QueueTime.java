package com.example.springboot.telefonia.response;

//import com.fasterxml.jackson.annotation.JsonProperty;


public class QueueTime {

    private String start_name;
    private String service_name;
    private double num_calls_queued;
    private String total_time_queued;
    private String average_time_queued;
    private String abandonment_time_queued;
    private double num_calls_queued_abandoned;
    private String answer_time_queued;
    private double num_calls_queued_answered;

    public QueueTime(String start_name, String service_name, double num_calls_queued, String total_time_queued,
                     String average_time_queued, String abandonment_time_queued, double num_calls_queued_abandoned, String answer_time_queued,
                     String answer_time_queue, double num_calls_queued_answered){

        this.start_name = String.valueOf(start_name);
        this.service_name = service_name;
        this. num_calls_queued = num_calls_queued;
        this.total_time_queued = String.valueOf(total_time_queued);
        this.average_time_queued = String.valueOf(average_time_queued);
        this.abandonment_time_queued = String.valueOf(abandonment_time_queued);
        this.num_calls_queued_abandoned = num_calls_queued_abandoned;
        this.answer_time_queued = String.valueOf(answer_time_queued);
        this.num_calls_queued_answered = num_calls_queued_answered;
    }
    public void setQueueTime(QueueTime queueTime) {

    }
    public QueueTime() {

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

    public double getNum_calls_queued() {

        return num_calls_queued;
    }


    public void setNum_calls_queued(double num_calls_queued) {

        this.num_calls_queued = num_calls_queued;
    }

    public String getTotal_time_queued(String s) {

        return total_time_queued;
    }

    public void setTotal_time_queued(String total_time_queued) {

        this.total_time_queued = total_time_queued;
    }

    public String getAverage_time_queued() {

        return average_time_queued;
    }

    public void setAverage_time_queued(String average_time_queued) {

        this.average_time_queued = average_time_queued;
    }

    public String getAbandonment_time_queued() {

        return abandonment_time_queued;
    }

    public void setAbandonment_time_queued(String abandonment_time_queued) {
        this.abandonment_time_queued = abandonment_time_queued;
    }
    public double getNum_calls_queued_abandoned() {

        return num_calls_queued_abandoned;
    }

    public void setNum_calls_queued_abandoned(double num_calls_queued_abandoned) {
        this.num_calls_queued_abandoned = num_calls_queued_abandoned;
    }
    public String getAnswer_time_queued() {

        return answer_time_queued;
    }

    public void setAnswer_time_queued(String answer_time_queued) {

        this.answer_time_queued = answer_time_queued;
    }

    public double getNum_calls_queued_answered() {

        return num_calls_queued_answered;
    }

    public void setNum_calls_queued_answered(double num_calls_queued_answered) {
        this.num_calls_queued_answered = num_calls_queued_answered;
    }
    @Override
    public String toString() {
     return "QueueTime[start_name=" + start_name + ",service_name=" + service_name + ", num_calls_queued=" + num_calls_queued + ", " +
      "total_time_queued=" + total_time_queued + ", average_time_queued=" + average_time_queued +", abandonment_time_queued=" + abandonment_time_queued +"," +
      "num_calls_queued_abandoned=" + num_calls_queued_abandoned +",answer_time_queued=" + answer_time_queued +",num_calls_queued_answered=" + num_calls_queued_answered +"]";
    }


}

