package com.kbak.springhttpclient.services;

import com.kbak.springhttpclient.api.domain.Fact;

import java.util.List;

public interface ApiService {
    List<Fact> getFacts(Integer amount);
}
