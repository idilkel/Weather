package com.jb.Weather.service;

import com.jb.Weather.cache.CacheService;
import com.jb.Weather.cache.Coordinate;
import com.jb.Weather.models.EditedResponse;
import com.jb.Weather.models.WeatherRes;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {
    private final RestTemplate restTemplate;
    private final CacheService cacheService;
    @Value("${urlStart}")
    private String urlStart;
    @Value("${urlMiddle}")
    private String urlMiddle;
    @Value("${urlEnd}")
    private String urlEnd;

//    @Override
//    public EditedResponse editResponse(double lat, double lon) {
//        WeatherRes res = restTemplate.getForObject(urlStart + lat + urlMiddle + lon + urlEnd, WeatherRes.class);
//        System.out.println("res");
//        double temp = res.getMain().getTemp();
//        double humidity = res.getMain().getHumidity();
//        String name = res.getName();
//        EditedResponse editedResponse = new EditedResponse(lat, lon, temp, humidity, name);
//        return editedResponse;
//    }

    @Override
    public EditedResponse editResponse(double lat, double lon) {
        EditedResponse editedResponse = cacheService.getResponseFromCache(lat, lon);
        Coordinate coordinate = new Coordinate(lat, lon);
        if (editedResponse == null) {
            WeatherRes res = restTemplate.getForObject(urlStart + lat + urlMiddle + lon + urlEnd, WeatherRes.class);
            System.out.println(res);
            double temp = res.getMain().getTemp();
            double humidity = res.getMain().getHumidity();
            String name = res.getName();
            editedResponse = new EditedResponse(lat, lon, temp, humidity, name);
            cacheService.save(coordinate, editedResponse);
        }
        return editedResponse;
    }
}
