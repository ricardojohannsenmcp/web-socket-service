package br.com.pulse.maestro.websoket.service.jobs;

import java.util.Collections;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.pusher.rest.Pusher;
import com.pusher.rest.data.Result;

import br.com.pulse.maestro.websoket.service.repository.MessageRepository;
import lombok.AllArgsConstructor;

@EnableScheduling
@AllArgsConstructor
@Component
public class MessageJob {
	
	private final Pusher pusher;
	private final MessageRepository repository;

	@Scheduled(fixedDelay = 1000 * 10)
	public void run() {
     Double index = Math.random() * 10;
			Result trigger = pusher.trigger(Collections.singletonList("canal"), "evento", repository.getMessage(index.intValue()));
			System.out.println("http status: "+ trigger.getHttpStatus());
			System.out.println("message: "+ trigger.getMessage());
			System.out.println("status: "+ trigger.getStatus().name());
			System.out.println("-------------------------------------------------------------------");
	}
	

}
