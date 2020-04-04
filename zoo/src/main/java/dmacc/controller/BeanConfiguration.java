package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Animals;
import dmacc.beans.Location;
@Configuration
public class BeanConfiguration {
	@Bean
	public Animals animal() {
		Animals bean = new Animals("flamingo", "30");
		return bean;
	}
	@Bean 
	public Location location() {
		Location bean = new Location("USA","OMAHA");
		return bean;
		
	}
}
