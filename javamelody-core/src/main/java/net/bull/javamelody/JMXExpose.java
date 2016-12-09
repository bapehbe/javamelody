package net.bull.javamelody;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.servlet.ServletContext;
import java.io.File;
import java.util.List;

/**
 * @author Alexey Pushkin
 */
public class JMXExpose {

    public static void start(Collector collector, ServletContext servletContext) throws JMException {
        String webapp = new File(servletContext.getRealPath("/")).getName();
        MBeanServer platformMBeanServer = MBeans.getPlatformMBeanServer();
        List<Counter> counters = collector.getCounters();
        for (Counter counter: counters) {
            CounterRequestMXBean mxBean = new CounterRequestMXBeanImpl(counter);
            String name = String.format("net.bull.javamelody:type=CounterRequest,name=%s,webapp=%s", counter.getName(), webapp);
            platformMBeanServer.registerMBean(mxBean, new ObjectName(name));
        }
    }
}
