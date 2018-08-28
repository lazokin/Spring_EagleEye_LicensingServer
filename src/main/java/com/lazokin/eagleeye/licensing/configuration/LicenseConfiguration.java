package com.lazokin.eagleeye.licensing.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LicenseConfiguration {
	
	@Value("${properties.comment}")
	private String comment;
	
	public String getComment() {
		return comment;
	}

}
