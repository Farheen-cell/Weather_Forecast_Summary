package com.masai.service;

import com.masai.output.WeatherResponse;

public interface WeatherHourlyService {
	
	public WeatherResponse callWeatherApiHourly(String city);

}
