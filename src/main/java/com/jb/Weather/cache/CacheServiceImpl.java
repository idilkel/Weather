package com.jb.Weather.cache;

import com.jb.Weather.models.EditedResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CacheServiceImpl implements CacheService {

    private final Map<Coordinate, EditedResponse> cache;

    @Override
    public EditedResponse getResponseFromCache(double lat, double lon) {
        if (cache.isEmpty()) {
            return null;
        }
        Coordinate coordinate = new Coordinate(lat, lon);
        return cache.get(coordinate);
    }

    @Override
    public void save(Coordinate coordinate, EditedResponse editedResponse) {
        cache.put(coordinate, editedResponse);
    }

    @Override
    public void clearAll() {
        cache.clear();
    }
}
