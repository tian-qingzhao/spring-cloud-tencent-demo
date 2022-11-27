package com.tqz.tencent.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>服务消费者启动
 *
 * <p>polaris各个服务端口号：
 * polaris-console：8080(http/tcp)
 * polaris-server：8090(http/tcp，注册中心端口)、8091(grpc/tcp，注册中心端口)、8093(grpc/tcp，配置中心端口)
 * polaris-limiter：8101(grpc/tcp)、8100(http/tcp)
 * prometheus：9090(http/tcp)
 *
 * @author tianqingzhao
 * @since 2022/11/25 15:00
 */
@SpringBootApplication
@EnableFeignClients("com.tqz.tencent.cloud.consumer.feign")
public class ConsumerServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ConsumerServiceApplication.class, args);
    }
}
