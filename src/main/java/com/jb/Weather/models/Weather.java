package com.jb.Weather.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weather {

    public int id;

    public String main;

    public String description;

    public String icon;
}
