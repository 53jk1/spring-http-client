package com.kbak.springhttpclient.services;

import com.kbak.springhttpclient.api.domain.Fact3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImpl3Test {

    @Autowired
    ApiService apiService;

    @Test
    public void testGetFacts3() throws Exception {

        Fact3[] facts3 = apiService.getFacts3("kali","US");

        Assertions.assertEquals(1, facts3.length);

    }
}