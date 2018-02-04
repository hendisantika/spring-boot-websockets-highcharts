package demo.service;

import com.sun.management.OperatingSystemMXBean;
import demo.model.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-websocket-highchart
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/02/18
 * Time: 06.10
 * To change this template use File | Settings | File Templates.
 */


@Service
public class OperatingSystemService {

    @Autowired
    private OperatingSystemMXBean operatingSystemMXBean;

    public Performance getPerformance() {
        Performance performance = new Performance();

        performance.setCommittedVirtualMemorySize(operatingSystemMXBean.getCommittedVirtualMemorySize());

        performance.setTotalSwapSpaceSize(operatingSystemMXBean.getTotalSwapSpaceSize());
        performance.setFreeSwapSpaceSize(operatingSystemMXBean.getFreeSwapSpaceSize());

        performance.setTotalPhysicalMemorySize(operatingSystemMXBean.getTotalPhysicalMemorySize());
        performance.setFreePhysicalMemorySize(operatingSystemMXBean.getFreePhysicalMemorySize());

        performance.setSystemCpuLoad(operatingSystemMXBean.getSystemCpuLoad());
        performance.setProcessCpuLoad(operatingSystemMXBean.getProcessCpuLoad());

        return performance;
    }
}
