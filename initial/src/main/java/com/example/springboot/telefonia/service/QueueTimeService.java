package com.example.springboot.telefonia.service;

import com.example.springboot.telefonia.Interface.QueueTimePort;
import com.example.springboot.telefonia.response.QueueTime;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class QueueTimeService<JavaQueueTimeSender> implements QueueTimePort {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueueTimeService.class);

    @Autowired
    private JavaQueueTimeSender sender;

    @Override
    public boolean QueueTimePort(QueueTimePort queueTimePort) {
        return false;
    }

    @Override
    public boolean sendQueueTimeTool(QueueTimePort queueTimeBody) {
        LOGGER.info("QueueTimeBody: {}", queueTimePort.toString());
        String pathToAttachment;
        return sendQueueTimeTool(queueTimePort.getStart_name(), queueTimePort.getService_name(),
                queueTimePort.getNum_calls_queued(), queueTimePort.getTotal_time_queued(),
                queueTimePort.getAverage_time_queued(), queueTimePort.getAbandonment_time_queued(),
                queueTimePort.getNum_calls_queued_abandoned(),queueTimePort.getAnswer_time_queued(),
                queueTimePort.getNum_calls_queued_answered());
    }

    private boolean sendQueueTimeTool(String start_name, String service_name, String num_calls_queued,
     String total_time_queued,String average_time_queued,String abandonment_time_queued,
      String num_calls_queued_abandoned, String answer_time_queued, String num_calls_queued_answered){

        boolean send = false;
        try {
            QueueTime helper = null;
            helper.setStart_name(start_name);
            helper.setService_name(service_name);
            helper.setNum_calls_queued(Double.parseDouble(num_calls_queued));
            helper.setTotal_time_queued(total_time_queued);
            helper.setAverage_time_queued(average_time_queued);
            helper.setAbandonment_time_queued(abandonment_time_queued);
            helper.setNum_calls_queued_abandoned(Double.parseDouble(num_calls_queued_abandoned));
            helper.setAnswer_time_queued(answer_time_queued);
            helper.setNum_calls_queued_answered(Double.parseDouble(num_calls_queued_answered));
            send = true;
        } catch (Exception e) {
            System.out.println("Se presento un error: {}");
        }
        return send;
    }

}