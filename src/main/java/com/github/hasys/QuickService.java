package com.github.hasys;

import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class QuickService {

    public Map<String, String> quickMethod() {
        HashMap map = new HashMap<>();

        map.put("firstParameter", "firstValue");
        map.put("secondParameter", "secondValue");

        return map;
    }
}