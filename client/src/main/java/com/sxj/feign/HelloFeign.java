package com.sxj.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider")
public interface HelloFeign {

    @GetMapping("/index")
    public String index();
}
