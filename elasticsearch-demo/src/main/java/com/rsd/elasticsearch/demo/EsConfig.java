package com.rsd.elasticsearch.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.rsd.elasticsearch.demo.repository")
public class EsConfig {

}
