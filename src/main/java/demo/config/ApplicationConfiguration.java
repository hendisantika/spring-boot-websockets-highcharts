package demo.config;

import com.sun.management.OperatingSystemMXBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.management.ManagementFactory;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-websocket-highchart
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/02/18
 * Time: 06.04
 * To change this template use File | Settings | File Templates.
 */

@Configuration
class ApplicationConfiguration {

    @Bean
    public OperatingSystemMXBean operatingSystemMXBean() {
        return ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
    }
}
