package dev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.service.MessageService;

@RestController
@RequestMapping("/api/message")
public class MessageController {
	
	private MessageService messageService;

	/**
	 * @param messageService
	 */
	public MessageController(MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	
	
	

}
