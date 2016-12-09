package net.bull.javamelody;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.servlet.ServletContext;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Alexey Pushkin
 */
public class JMXExpose {
    private static Set<ObjectName> names = new HashSet<ObjectName>();

    public static void start(Collector collector, ServletContext servletContext) throws JMException {
        String webapp = new File(servletContext.getRealPath("/")).getName();
        MBeanServer platformMBeanServer = MBeans.getPlatformMBeanServer();
        List<Counter> counters = collector.getCounters();
        for (Counter counter: counters) {
            CounterRequestMXBean mxBean = new CounterRequestMXBeanImpl(counter);
            ObjectName name = new ObjectName(String.format("net.bull.javamelody:type=CounterRequest,context=%s,name=%s",
                    webapp, counter.getName()));
            platformMBeanServer.registerMBean(mxBean, name);
            names.add(name);
        }
    }

    public static void stop() throws JMException {
        MBeanServer platformMBeanServer = MBeans.getPlatformMBeanServer();
        Iterator<ObjectName> it = names.iterator();
        while (it.hasNext()) {
            ObjectName name = it.next();
            platformMBeanServer.unregisterMBean(name);
            it.remove();
        }
    }
}
