package org.com;

import java.util.List;

public class Country {
	String countryName;
	List<String> listOfStates;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<String> getListOfStates() {
		return listOfStates;
	}

	public void setListOfStates(List<String> listOfStates) {
		this.listOfStates = listOfStates;
	}

	public void printListOfStates() {
		System.out.println("Some of states in india are:");
		for (String state : listOfStates) {
			System.out.println(state);
		}
	}
}
