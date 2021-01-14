package com.kbak.springhttpclient.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Fact3 implements Serializable {

    public String name;
    public String gender;
    public Double probability;
    public Integer count;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}