package com.tqz.tencent.cloud.consumer.config;

import com.tencent.cloud.polaris.ratelimit.RateLimitRuleLabelResolver;
import com.tencent.cloud.polaris.ratelimit.config.PolarisRateLimitProperties;
import com.tencent.cloud.polaris.ratelimit.filter.QuotaCheckServletFilter;
import com.tencent.cloud.polaris.ratelimit.spi.PolarisRateLimiterLabelServletResolver;
import com.tencent.polaris.ratelimit.api.core.LimitAPI;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2022/11/27 14:11
 */
public class CustomeRatelimitConfig extends QuotaCheckServletFilter {
    
    public CustomeRatelimitConfig(LimitAPI limitAPI, PolarisRateLimiterLabelServletResolver labelResolver,
            PolarisRateLimitProperties polarisRateLimitProperties,
            RateLimitRuleLabelResolver rateLimitRuleLabelResolver) {
        super(limitAPI, labelResolver, polarisRateLimitProperties, rateLimitRuleLabelResolver);
    }
}
