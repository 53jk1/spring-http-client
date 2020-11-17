package com.kbak.springhttpclient.services;

import com.kbak.springhttpclient.api.domain.Fact;

public interface ApiService {

    Fact[] getFacts(String name, String countryId);
}
