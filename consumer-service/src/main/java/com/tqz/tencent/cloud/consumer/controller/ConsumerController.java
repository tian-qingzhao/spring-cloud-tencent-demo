package com.tqz.tencent.cloud.consumer.controller;

import com.tqz.tencent.cloud.consumer.feign.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2022/11/25 15:03
 */
@RestController
public class ConsumerController {
    
    @Autowired
    private ProviderFeignClient providerFeignClient;
    
    @Value("${consumer.test}")
    private String consumerTest;
    
    @RequestMapping("consumer")
    public String consumer(@RequestParam(defaultValue = "dev1") String env) {
        String result = providerFeignClient.provider(env);
        System.out.println(result);
        return result;
    }
    
    @RequestMapping("getConfig")
    public String getConfig() {
        return consumerTest;
    }
}
