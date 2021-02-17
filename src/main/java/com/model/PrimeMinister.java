package com.model;

import java.util.HashSet;
import java.util.Set;

import com.facilities.Aircraft;
import com.facilities.Car;

public class PrimeMinister extends Parliamentarian{

	private Set<Object> facility;

	public Set<Object> getFacility() {
		Car car = new Car();
		Aircraft aircraft = new Aircraft();
		facility = new HashSet<Object>();
		facility.add(car);
		facility.add(aircraft);
		return facility;
	}

	
	
}
