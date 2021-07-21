package br.com.pulse.maestro.websoket.service.controller;

import java.util.Collections;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pusher.rest.Pusher;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class WebSocketController {
	
	
	private final Pusher pusher;
	
	@PostMapping
	public void send() {
		Object toSend =   new Object();
		
		pusher.trigger(Collections.singletonList("xxx"), "canal_que_o_cara_subscreveu", toSend);
	}

}
