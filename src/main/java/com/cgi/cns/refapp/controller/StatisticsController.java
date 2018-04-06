package com.cgi.cns.refapp.controller;

import com.cgi.cns.refapp.domain.Statistics;
import com.cgi.cns.refapp.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @RequestMapping(path = "/{accountName}", method = RequestMethod.GET)
    public Statistics getStatisticsByAccountByName(@PathVariable String accountName) {
        return statisticsService.findByAccountName(accountName);
    }

}
