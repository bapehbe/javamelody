package net.bull.javamelody;

/**
 * @author jam
 * @version $Id$
 */
public class CounterRequestMXBeanImpl implements CounterRequestMXBean {

    private final Counter counter;

    public CounterRequestMXBeanImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public CounterRequestAggregationData getCounterRequestAggregation() {
        return new CounterRequestAggregationData(new CounterRequestAggregation(counter));
    }

}
