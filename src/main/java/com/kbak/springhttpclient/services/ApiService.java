package com.kbak.springhttpclient.services;

import com.kbak.springhttpclient.api.domain.Fact;
import com.kbak.springhttpclient.api.domain.Fact3;

public interface ApiService {

    Fact[] getFacts(String name, String country_id);
    Fact[] getFacts2(String name, String country_id);
    Fact3[] getFacts3(String name, String country_id);
    Fact3[] getFacts4(String name, String country_id);
}
