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
		
		
		
	       private String appId;
			
			private String appKey;
			
			private String appSecret;
	}

}
