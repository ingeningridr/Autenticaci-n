package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.LostCallsPort;
import com.example.springboot.telefonia.dto.CallsBody;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class LostCallsService<JavaLostCallsSender> implements LostCallsPort {
}
    private static final Logger LOGGER = LoggerFactory.getLogger(LostCallsService.class);

    @Autowired
    private JavaLostCallsSender sender;

    @Override
    public boolean LostCallsPort(LostCallsPort lostCallsPort) throws Exception {
        return false;
    }

    @Override
    public boolean sendLostCalls(LostCallsPort lostCallsBody) throws Exception {
        LOGGER.info("LostCallsBody: {}", lostCallsBody.toString());
        String pathToAttachment;
        return sendLostCalls(lostCallsPort.getStart_name(), lostCallsPort.getService_name(), lostCallsPort.getPhone_number());
    }
    private boolean sendLostCallsTool(String start_name, String service_name, String phone_number){

        boolean send = false;
        try {

            CallsBody helper = null;
            helper.setStart_name(start_name);
            helper.setService_name(service_name);
            helper.setPhone_number(Integer.parseInt(phone_number));
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }
}