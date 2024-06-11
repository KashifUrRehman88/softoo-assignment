package com.coderbyte.challenge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Kashif Rehman
 * Created on 11th Of June,2024.
 * To use RestTemplate in our controllers, we need to define it as a bean.
 */

@Configuration
public class RestTemplateConfig {

	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
