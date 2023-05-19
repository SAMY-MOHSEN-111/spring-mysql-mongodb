package com.global.multidb.service;

import com.global.multidb.model.Analytics;
import com.global.multidb.repository.AnalyticsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnalyticsService {

    private final AnalyticsRepository analyticsRepository;

    public void addUserAccess(String userId) {
        analyticsRepository.insert(new Analytics(null, userId, 1L));
    }
}
