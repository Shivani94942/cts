package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Movie;

@RestController
public class RecommController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(path = "/recommendations",method = RequestMethod.GET)
	@ResponseBody
	public Movie[] recommendations() {
		Movie[] result= restTemplate.getForObject("http://movie-service/api/movies", Movie[].class);
		
		return result;
	}

}
