package com.hyomee.service.elastic.tour.scheduler;

import com.hyomee.service.elastic.tour.service.TourListServie;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RequiredArgsConstructor
@Service
public class RecommendAddCountService {


    private final TourListServie tourListServie;

    @Scheduled(initialDelay = 60000, fixedDelay = 60000 )
    public void scheduledJob() {
        tourListServie.updateCount();
    }
}
