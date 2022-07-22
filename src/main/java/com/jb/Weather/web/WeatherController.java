package com.jb.Weather.web;

import com.jb.Weather.models.EditedResponse;
import com.jb.Weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping
    public EditedResponse getWeather(@RequestParam double lat, @RequestParam double lon) {
        return weatherService.editResponse(lat, lon);
    }
}
