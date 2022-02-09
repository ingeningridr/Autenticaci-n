package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.QueueTimePort;
import com.example.springboot.telefonia.Interface.SurveyPort;
import com.example.springboot.telefonia.response.Survey;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class SurveyService<JavaSurveySender> implements SurveyPort {

    private static final Logger LOGGER = LoggerFactory.getLogger(SurveyService.class);

    @Autowired
    private JavaSurveySender sender;

    @Override
    public boolean SurveyPort(SurveyPort surveyPort) throws Exception {
        return false;
    }

    @Override
    public boolean sendSurvey(QueueTimePort SurveyBody) throws Exception {
        LOGGER.info("SurveyBody: {}", surveyPort.toString());
        String pathToAttachment;
        return sendSurveyTool(surveyPort.getStart_name(), surveyPort.getService_name(),
                surveyPort.getPhone_number(), surveyPort.getFcr(),
                surveyPort.geNps(), surveyPort.getCs(),
                surveyPort.getP1(), surveyPort.getP2(),
                surveyPort.getP3(),surveyPort.getP4(),
                surveyPort.getP5(), surveyPort.getP6(),
                surveyPort.getP7(),surveyPort.getP8(),
                surveyPort.getP9());

    }
    private boolean sendSurveyTool(String start_name, String service_name, String phone_number,
                                      String fcr, String nps, String cs, String p1, String p2, String p3,
                                      String p4, String p5, String p6, String p7, String p8, String p9) {

        boolean send = false;
        try {
            Survey helper = null;
            helper.setStart_name(start_name);
            helper.setService_name(service_name);
            helper.setPhone_number(Integer.parseInt(phone_number));
            helper.setFCR(fcr);
            helper.setNPS(nps);
            helper.setCS(Integer.parseInt(cs));
            helper.setP1(p1);
            helper.setP2(p2);
            helper.setP3(p3);
            helper.setP3(p4);
            helper.setP3(p5);
            helper.setP3(p6);
            helper.setP3(p7);
            helper.setP3(p8);
            helper.setP3(p9);
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }
}