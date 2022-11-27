package com.tqz.tencent.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2022/11/25 15:02
 */
@RestController
public class ProviderController {
    
    @Autowired
    private Environment environment;
    
    @RequestMapping("provider")
    public String provider(String env) {
        if (System.getProperty("spring.cloud.tencent.metadata.content.env").equals(env)) {
            throw new RuntimeException("env等于dev1时手动抛出异常测试服务熔断");
        }
        
        Integer serverPort = environment.getProperty("server.port", Integer.class);
        String result = System.currentTimeMillis() + " " + env + " " + serverPort;
        System.out.println(result);
        return result;
    }
}
