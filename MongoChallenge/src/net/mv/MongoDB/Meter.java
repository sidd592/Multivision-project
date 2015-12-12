package net.mv.MongoDB;

import java.util.Date;

import com.sun.jndi.cosnaming.IiopUrl.Address;

public class Meter {

	private String meterId;
	private String meterModel;
	private Date installDate;
	private Address address;
	
	public Meter() {}

	public Meter(String meterId, String meterModel, Date installDate,
			Address address) {
		super();
		this.meterId = meterId;
		this.meterModel = meterModel;
		this.installDate = installDate;
		this.address = address;
	}

	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public String getMeterModel() {
		return meterModel;
	}

	public void setMeterModel(String meterModel) {
		this.meterModel = meterModel;
	}

	public Date getInstallDate() {
		return installDate;
	}

	public void setInstallDate(Date installDate) {
		this.installDate = installDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
