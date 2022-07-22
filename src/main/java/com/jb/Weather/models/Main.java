package com.jb.Weather.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Main {
    @JsonProperty("temp")
    public double temp;
    @JsonProperty("feels_like")
    public double feelsLike;
    @JsonProperty("temp_min")
    public double tempMin;
    @JsonProperty("temp_max")
    public double tempMax;
    @JsonProperty("pressure")
    public int pressure;
    @JsonProperty("humidity")
    public int humidity;
}
