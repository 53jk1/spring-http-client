package com.kbak.springhttpclient.services;

import com.kbak.springhttpclient.api.domain.Fact;

import com.kbak.springhttpclient.api.domain.Fact3;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

    final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Fact[] getFacts(String name, String country_id) {

        return restTemplate.getForObject("https://api.agify.io?name[]=" + name + "&country_id=" + country_id, Fact[].class);

    }

    @Override
    public Fact[] getFacts2(String name, String country_id) {

        return restTemplate.getForObject("https://api.agify.io?name[]=" + name + "&country_id=" + country_id, Fact[].class);

    }

    @Override
    public Fact3[] getFacts3(String name, String country_id){

        return restTemplate.getForObject("https://api.genderize.io?name=" + name + "&country_id=" + country_id, Fact3[].class);
    }

    @Override
    public Fact3[] getFacts4(String name, String country_id){

        return restTemplate.getForObject("https://api.genderize.io?name=" + name + "&country_id=" + country_id, Fact3[].class);

    }

}
