package com.jb.Weather.service;

import com.jb.Weather.models.EditedResponse;

public interface WeatherService {
    EditedResponse editResponse(double lat, double lon);
}
