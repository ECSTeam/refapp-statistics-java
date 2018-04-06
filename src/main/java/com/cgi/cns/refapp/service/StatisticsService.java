package com.cgi.cns.refapp.service;

import com.cgi.cns.refapp.domain.Statistics;

public interface StatisticsService {

    /**
     * Finds account by given name
     *
     * @param accountName
     * @return found account
     */
    Statistics findByAccountName(String accountName);

}
