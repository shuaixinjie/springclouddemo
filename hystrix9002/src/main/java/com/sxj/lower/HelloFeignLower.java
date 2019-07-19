package com.sxj.lower;

import com.sxj.feign.HelloFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignLower implements FallbackFactory<HelloFeign> {
    @Override
    public HelloFeign create(Throwable throwable) {
        return new HelloFeign() {
            @Override
            public String index() {
                return "服务器降级。。。";
            }
        };
    }
}
