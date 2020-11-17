package com.kbak.springhttpclient.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Fact implements Serializable
{

    public String name;
    public Integer age;
    public Integer count;
    public String countryId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5555955142545087844L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}