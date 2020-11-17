package com.kbak.springhttpclient.services;

import com.kbak.springhttpclient.api.domain.Fact;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

    final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Fact[] getFacts(String name, String countryId) {

        Fact[] facts = restTemplate.getForObject("https://api.agify.io?name[]=" + name + "&country_id=" + countryId, Fact[].class);
        return facts;

    }
}
