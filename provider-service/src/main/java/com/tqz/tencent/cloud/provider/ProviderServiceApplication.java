package com.tqz.tencent.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>服务提供者启动类
 *
 * <p> 启动参数添加：
 * 服务提供者1 `-Dserver.port=7011 -Dspring.cloud.polaris.stat.port=28081 -Dspring.cloud.tencent.metadata.content.env=dev1`，
 * 服务提供者2 `-Dserver.port=7012 -Dspring.cloud.polaris.stat.port=28082 -Dspring.cloud.tencent.metadata.content.env=dev2`
 *
 * @author tianqingzhao
 * @since 2022/11/25 14:42
 */
@SpringBootApplication
public class ProviderServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceApplication.class, args);
    }
}
