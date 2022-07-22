package com.jb.Weather.cache;

import com.jb.Weather.models.EditedResponse;

public interface CacheService {
    EditedResponse getResponseFromCache(double lat, double lon);

    void save(Coordinate coordinate, EditedResponse editedResponse);

    void clearAll();
}
