package com.jb.Weather.config;

import com.jb.Weather.cache.Coordinate;
import com.jb.Weather.models.EditedResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.TreeMap;

@Configuration
public class MapConfig {
    @Bean
    public Map<Coordinate, EditedResponse> map() {
        return new TreeMap<>();
    }
}
