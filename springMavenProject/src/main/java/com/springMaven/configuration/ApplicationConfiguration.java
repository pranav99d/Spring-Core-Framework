package com.springMaven.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springMaven.Country;

@Configuration
public class ApplicationConfiguration {

	@Bean(name = "countryObj")
	public Country getCountry() {
		return new Country("India");
	}
}
