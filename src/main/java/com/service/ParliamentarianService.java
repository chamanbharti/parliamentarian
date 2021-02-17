package com.service;

import com.model.Driver;
import com.model.Pilot;

public interface ParliamentarianService {

	public String getConstituency();
	public Driver getDriver();
	public Pilot getPilot();
	public double getExceedsSpendingLimit();
	public boolean hasPermission();
	public boolean arrest();
}
