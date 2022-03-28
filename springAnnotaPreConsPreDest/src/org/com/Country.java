package org.com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Country {
	String countryName;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@PostConstruct
	public void init() {
		System.out.println("In init block of country");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("In destroy block of country");
	}
}
