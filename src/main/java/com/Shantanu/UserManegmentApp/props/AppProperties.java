package com.Shantanu.UserManegmentApp.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app1")
public class AppProperties {

	private Map<String, String> maessage= new HashMap<String,String>();

	public Map<String, String> getMaessage() {
		return maessage;
	}

	public void setMaessage(Map<String, String> maessage) {
		this.maessage = maessage;
	}
	
	
}
