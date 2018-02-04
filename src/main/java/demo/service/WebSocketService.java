package demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.broker.BrokerAvailabilityEvent;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-websocket-highchart
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/02/18
 * Time: 06.15
 * To change this template use File | Settings | File Templates.
 */

@Service
public class WebSocketService implements ApplicationListener<BrokerAvailabilityEvent> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private OperatingSystemService operatingSystemService;

    @Override
    public void onApplicationEvent(BrokerAvailabilityEvent event) {
        logger.info("" + event);
    }

    @Scheduled(fixedRate = 1000)
    public void send() {
        messagingTemplate.convertAndSend("/performance", operatingSystemService.getPerformance());
    }
}
