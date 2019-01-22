package com.omkar.vmdeploy.HelloWeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omkar.vmdeploy.HelloWeb.beans.SimpleBean;

@RestController
public class SimpleController 
{

	@GetMapping("/simplebean")
	public SimpleBean getBean()
	{
		return new SimpleBean("Omkar", "Gold", "QW3R-TYU1-0PA5");
	}
}
