package com.tqz.tencent.cloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2022/11/25 14:56
 */
@FeignClient(value = "provider-service")
public interface ProviderFeignClient {

    @RequestMapping("provider")
    String provider(@RequestParam("env") String env);
}
