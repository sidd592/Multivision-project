package net.mv.MongoDB;

import java.util.Date;

public class MeterReading {
	
	private Meter meter;
	private Date readingTime;
	private Double kwh;	

	public MeterReading() {}

	public MeterReading(Meter meter, Date readingTime, Double kwh) {
		super();
		this.meter = meter;
		this.readingTime = readingTime;
		this.kwh = kwh;
	}

	public Meter getMeter() {
		return meter;
	}

	public void setMeter(Meter meter) {
		this.meter = meter;
	}

	public Date getReadingTime() {
		return readingTime;
	}

	public void setReadingTime(Date readingTime) {
		this.readingTime = readingTime;
	}

	public Double getKwh() {
		return kwh;
	}

	public void setKwh(Double kwh) {
		this.kwh = kwh;
	}

	@Override
	public String toString() {
		return "MeterReading [meter=" + meter + ", readingTime=" + readingTime
				+ ", kwh=" + kwh + "]";
	}
	
	

}
