package com.cgi.cns.refapp.service;

import com.cgi.cns.refapp.domain.Statistics;
import org.springframework.stereotype.Service;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Override
    public Statistics findByAccountName(String accountName) {
        Statistics statistics = new Statistics();
        statistics.setData("Nothing to see here... move along... move along...");

        return statistics;

    }

}
