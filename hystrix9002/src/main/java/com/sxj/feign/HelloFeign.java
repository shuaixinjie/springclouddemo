package com.sxj.feign;

import com.sxj.lower.HelloFeignLower;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",fallbackFactory = HelloFeignLower.class)
public interface HelloFeign {
    @GetMapping("/index")
    public String index();
}
