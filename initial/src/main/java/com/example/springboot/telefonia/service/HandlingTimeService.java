package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.HandlingTimePort;
import com.example.springboot.telefonia.response.HandlingTime;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class HandlingTimeService<JavaHandlingTimeSender> implements HandlingTimePort {

    private static final Logger LOGGER = LoggerFactory.getLogger(HandlingTimeService.class);

    @Autowired
    private JavaHandlingTimeSender sender;


    @Override
    public boolean HandlingTimePort(HandlingTimePort handlingTimePort) throws Exception {
        return false;
    }

    @Override
    public boolean sendHandlingTime(HandlingTimePort handlingTimeBody) throws Exception {
        LOGGER.info("HandlingTimeBody: {}", handlingTimePort.toString());
        String pathToAttachment;
        return sendHandlingTime(handlingTimePort.getStart_name(), handlingTimePort.getService_name(),
        handlingTimePort.getnum_calls_answered(), handlingTimePort.getHandling_time(),handlingTimePort.getAverage_handling_time()
        ,handlingTimePort.getTalk_time_in(),handlingTimePort.getAverage_talk_time_in());
    }
    
    private boolean sendHandlingTimeTool(String start_name, String service_name, String num_calls_answered,
    String handling_time,String average_handling_time,String talk_time_in, String average_talk_time_in ){

        boolean send = false;
        try {

            HandlingTime helper = null;
            helper.setStart_name(start_name);
            helper.setService_name(service_name);
            helper.setNum_calls_answered(Double.parseDouble(num_calls_answered));
            helper.setHandling_time(handling_time);
            helper.setService_name(service_name);
            helper.setAverage_handling_time(average_handling_time);
            helper.setTalk_time_in(talk_time_in);
            helper.setAverage_talk_time_in(average_talk_time_in);
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }

}
