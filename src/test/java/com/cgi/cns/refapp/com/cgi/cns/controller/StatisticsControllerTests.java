package com.cgi.cns.refapp.com.cgi.cns.controller;

import com.cgi.cns.refapp.domain.Statistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StatisticsControllerTests
{
    @LocalServerPort
    private int port;

    private URL baseControllerUrl;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.baseControllerUrl = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getStatisticsByAccountName_ReturnsData(){

        // Arrange
        String methodUrl = this.baseControllerUrl.toString() + "demo";

        // Act
        ResponseEntity<Statistics> response = template.getForEntity(methodUrl, Statistics.class);

        // Assert
        Assert.assertNotNull(response);

        Statistics theStatistics = response.getBody();
        Assert.assertNotNull(theStatistics);

        Assert.assertNotNull(theStatistics.getData());

    }

}
