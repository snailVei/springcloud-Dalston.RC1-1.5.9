package com.forezp.service;

import org.springframework.stereotype.Component;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String diff_hystrix_hi(String name) {
        return "sorry "+name;
    }
}
