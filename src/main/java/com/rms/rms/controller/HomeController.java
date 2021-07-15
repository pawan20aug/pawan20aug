package com.rms.rms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.rms.service.ServiceLayer;

@RestController
public class HomeController {

	private final ServiceLayer serviceLayer;
	
	public HomeController(ServiceLayer serviceLayer)
	{
		this.serviceLayer=serviceLayer;
	}
	
	@GetMapping("/")
	public Object getData()
	{
		return serviceLayer.consumeAPI();
	}
}
