package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.AuthenticatePort;
import com.example.springboot.telefonia.dto.AuthenticateBody;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

@Service
public class AuthenticateService<JavaAuthenticateSender> implements AuthenticatePort {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticateService.class);

    @Autowired
    private JavaAuthenticateSender sender;

    @Override
    public boolean sendAuthenticate(AuthenticatePort authenticateBody) throws Exception {

            LOGGER.info("AuthenticateBody: {}", authenticateBody.toString());
            String pathToAttachment;
            return sendAuthenticate(authenticateBody.getKey(), authenticateBody.getToken());
        }
    private boolean sendAuthenticateTool(String key, String token){

        boolean send = false;
        try {
            AuthenticateBody helper = null;
            helper.setKey(key);
            helper.setToken(token);
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }

}