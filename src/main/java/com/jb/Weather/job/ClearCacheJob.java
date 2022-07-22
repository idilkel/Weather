package com.jb.Weather.job;

import com.jb.Weather.cache.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClearCacheJob {
    private final CacheService cacheService;

    @Scheduled(cron = " 0 0 */1 * * *")
    public void dailyClear() {
        cacheService.clearAll();
    }
}
