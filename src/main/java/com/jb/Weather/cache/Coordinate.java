package com.jb.Weather.cache;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coordinate implements Comparable<Coordinate> {
    private double lat;
    private double lon;


    @Override
    public int compareTo(Coordinate o) {
        if (this.lat == o.lat && this.lon == o.lon) {
            return 0;
        }
        if (this.lat != o.lat) {
            if (this.lat - o.lat < 0) {
                return -1;
            } else if (this.lat - o.lat > 0) {
                return 1;
            }
            ;
        }
        ;
        if (this.lon != o.lon) {
            if (this.lon - o.lon < 0) {
                return -1;
            } else if (this.lon - o.lon > 0) {
                return 1;
            }
            ;
        }
        ;
        return 0;
    }


}
