package com.service;

import com.model.Driver;
import com.model.Pilot;
import com.model.PrimeMinister;

public class ParliamentarianServiceImpl implements ParliamentarianService {

	private final double pmExpendLimit = 1;//digit in crore
	private final double ministerExpendLimit = 10;//digit in lakhs
	private final double mpExpendLimit = 1;//digit in lakh
	
	public String getConstituency() {
		return null;
	}

	public Driver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	public Pilot getPilot() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getExceedsSpendingLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasPermission() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean arrest() {
		return false;
	}

}
