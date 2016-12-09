package net.bull.javamelody;


public class CounterRequestData {
	private float systemErrorPercentage;
	private int cpuTimeMean;
	private long cpuTimeSum;
	private long maximum;
	private int standardDeviation;
	private int mean;
	private long durationsSum;
	private long hits;
	private String name;
	private int responseSizeMean;

    public CounterRequestData (CounterRequest request) {
        responseSizeMean = request.getResponseSizeMean();
        systemErrorPercentage = request.getSystemErrorPercentage();
        cpuTimeMean = request.getCpuTimeMean();
        cpuTimeSum = request.getCpuTimeSum();
        maximum = request.getMaximum();
        standardDeviation = request.getStandardDeviation();
        mean = request.getMean();
        durationsSum = request.getDurationsSum();
        hits = request.getHits();
        name = request.getName();
    }

	public String getName() {
		return name;
	}

	public long getHits() {
		return hits;
	}

	public long getDurationsSum() {
		return durationsSum;
	}

	public int getMean() {
		return mean;
	}

	public int getStandardDeviation() {
		return standardDeviation;
	}

	public long getMaximum() {
		return maximum;
	}

	public long getCpuTimeSum() {
		return cpuTimeSum;
	}

	public int getCpuTimeMean() {
		return cpuTimeMean;
	}

	public float getSystemErrorPercentage() {
		return systemErrorPercentage;
	}

	public int getResponseSizeMean() {
		return responseSizeMean;
	}

	public void setResponseSizeMean(int responseSizeMean) {
		this.responseSizeMean = responseSizeMean;
	}

	public void setSystemErrorPercentage(float systemErrorPercentage) {
		this.systemErrorPercentage = systemErrorPercentage;
	}

	public void setCpuTimeMean(int cpuTimeMean) {
		this.cpuTimeMean = cpuTimeMean;
	}

	public void setCpuTimeSum(long cpuTimeSum) {
		this.cpuTimeSum = cpuTimeSum;
	}

	public void setMaximum(long maximum) {
		this.maximum = maximum;
	}

	public void setStandardDeviation(int standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

	public void setMean(int mean) {
		this.mean = mean;
	}

	public void setDurationsSum(long durationsSum) {
		this.durationsSum = durationsSum;
	}

	public void setHits(long hits) {
		this.hits = hits;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	public static CounterRequestData from(CompositeData cd) {
		if (cd == null) {
			return null;
		}

		CounterRequestData data = new CounterRequestData();
			private int responseSizeMean;
	private float systemErrorPercentage;
	private int cpuTimeMean;
	private long cpuTimeSum;
	private long maximum;
	private int standardDeviation;
	private int mean;
	private long durationsSum;
	private long hits;
	private String name
	}
	*/

}
