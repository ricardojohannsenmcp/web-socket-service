package br.com.pulse.maestro.websoket.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pusher.rest.Pusher;

import br.com.pulse.maestro.websoket.service.config.PusherPropertiesConfig;

@SpringBootApplication
public class CatchupWebsocketServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatchupWebsocketServiceApplication.class, args);
	}
	
	
	
	@Bean
	public Pusher createPusher(PusherPropertiesConfig config) {
		
		Pusher pusher = new Pusher(config.getProps().getAppId(), 
				config.getProps().getAppKey(), 
				config.getProps().getAppSecret());
		pusher.setCluster("us2");
		pusher.setEncrypted(true);
		return pusher;
	}

}
