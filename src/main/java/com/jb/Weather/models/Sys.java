package com.jb.Weather.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sys {

    public int type;

    public int id;

    public String country;

    public int sunrise;

    public int sunset;
}
