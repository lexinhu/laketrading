package com.xn2001.laketrading.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 乐心湖
 * @date 2021/1/28 2:37
 **/
@Configuration
public class LaketradingElasticsearchConfig {

    @Bean
    public RestHighLevelClient esRestClient(){
        return new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.56.10", 9200, "http")));
    }

}
