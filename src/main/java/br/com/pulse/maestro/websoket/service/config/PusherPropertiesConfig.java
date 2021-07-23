package br.com.pulse.maestro.websoket.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Getter
@Component
@ConfigurationProperties("app")
public class PusherPropertiesConfig {
	
	
	private PusherProperties props = new PusherProperties();
	
	@Data
	public static class PusherProperties{
		
		
		
	       private String appId =  "1238424";
			
			private String appKey = "62798a4b3962ada6abb1";
			
			private String appSecret = "b4bc185070644dfb7965";
	}

}


