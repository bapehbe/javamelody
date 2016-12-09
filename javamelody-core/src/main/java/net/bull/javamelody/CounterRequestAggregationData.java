package net.bull.javamelody;

import java.util.Map;
import java.util.SortedMap;

/**
 * @author jam
 * @version $Id$
 */
public class CounterRequestAggregationData {
    private CounterRequestData globalRequest;
    private CounterRequestData warningRequest;
    private CounterRequestData severeRequest;
    private int warningThreshold;
    private int severeThreshold;

    public CounterRequestAggregationData (CounterRequestAggregation aggregation) {
        this.globalRequest = new CounterRequestData(aggregation.getGlobalRequest());
        this.warningRequest = new CounterRequestData(aggregation.getWarningRequest());
        this.severeRequest = new CounterRequestData(aggregation.getSevereRequest());
        this.warningThreshold = aggregation.getWarningThreshold();
        this.severeThreshold = aggregation.getSevereThreshold();
    }

    public CounterRequestData getGlobalRequest() {
        return globalRequest;
    }

    public CounterRequestData getWarningRequest() {
        return warningRequest;
    }

    public CounterRequestData getSevereRequest() {
        return severeRequest;
    }

    public int getWarningThreshold() {
        return warningThreshold;
    }

    public int getSevereThreshold() {
        return severeThreshold;
    }

    public void setGlobalRequest(CounterRequestData globalRequest) {
        this.globalRequest = globalRequest;
    }

    public void setWarningRequest(CounterRequestData warningRequest) {
        this.warningRequest = warningRequest;
    }

    public void setSevereRequest(CounterRequestData severeRequest) {
        this.severeRequest = severeRequest;
    }

    public void setWarningThreshold(int warningThreshold) {
        this.warningThreshold = warningThreshold;
    }

    public void setSevereThreshold(int severeThreshold) {
        this.severeThreshold = severeThreshold;
    }
}
