package com.kbak.springhttpclient.services;

import com.kbak.springhttpclient.api.domain.Fact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImpl2Test {

    @Autowired
    ApiService apiService;

    @Test
    public void testGetFacts2() throws Exception {

        Fact[] facts2 = apiService.getFacts2("Maximilian", "DE");

        Assertions.assertEquals(1, facts2.length);

    }
}
