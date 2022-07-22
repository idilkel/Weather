package com.jb.Weather.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherRes {


    public Coord coord;

    public List<Weather> weather = null;

    public String base;

    public Main main;

    public int visibility;

    public Wind wind;

    public Clouds clouds;

    public int dt;

    public Sys sys;

    public int timezone;

    public int id;

    public String name;

    public int cod;

}
