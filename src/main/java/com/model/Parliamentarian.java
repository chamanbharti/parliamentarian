package com.model;
public class Parliamentarian {
	private String name;
	private String partyName;
	private String address;
	private String constituency;
	private double exceedsSpendingLimit;
	private boolean hasPermission;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public double getExceedsSpendingLimit() {
		return exceedsSpendingLimit;
	}
	public void setExceedsSpendingLimit(double exceedsSpendingLimit) {
		this.exceedsSpendingLimit = exceedsSpendingLimit;
	}
	public boolean isHasPermission() {
		return hasPermission;
	}
	public void setHasPermission(boolean hasPermission) {
		this.hasPermission = hasPermission;
	}
	
}
