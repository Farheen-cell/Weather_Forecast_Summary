package com.masai.service;

import com.masai.output.WeatherResponse;

public interface WeatherSummaryService {
	
	public WeatherResponse callRapidApiByCityName(String city);

}
