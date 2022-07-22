package com.jb.Weather.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EditedResponse {
    private double lon;
    private double lat;
    private double temp;
    private double humidity;
    private String name;
}
