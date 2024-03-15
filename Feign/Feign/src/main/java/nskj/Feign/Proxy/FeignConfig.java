package nskj.Feign.Proxy;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "nskj.Feign.Proxy")
public class FeignConfig {
}
