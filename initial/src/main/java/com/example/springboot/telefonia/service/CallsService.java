package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.CallsPort;
import com.example.springboot.telefonia.response.Calls;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public abstract class CallsService<JavaCallsSender> implements CallsPort {

        private static final Logger LOGGER = LoggerFactory.getLogger(CallsService.class);

        @Autowired
        private JavaCallsSender sender;

        @Override
        public boolean sendCalls(CallsPort callsBody) throws Exception {
            LOGGER.info("CallsBody: {}", callsPort.toString());
            String pathToAttachment;
            return sendCalls(callsPort.getStart_name(), callsPort.getService_name(), callsPort.getPhone_number());
        }
        private boolean sendCallsTool(String start_name, String service_name, String phone_number){

            boolean send = false;
            try {
                Calls helper = null;
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
