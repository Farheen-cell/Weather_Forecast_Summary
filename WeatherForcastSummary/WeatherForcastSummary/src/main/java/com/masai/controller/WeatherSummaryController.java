package com.masai.controller;

import com.masai.output.WeatherResponse;
import com.masai.service.WeatherSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weatherForeCast")
public class WeatherSummaryController {
	
	@Autowired
	private WeatherSummaryService weatherService;
	
	@GetMapping("/summary/{cityName}")
	public ResponseEntity<WeatherResponse> getResponseFromApi(@PathVariable String cityName){
		
		return new ResponseEntity<WeatherResponse>(weatherService.callRapidApiByCityName(cityName),HttpStatus.OK);
	}

}
