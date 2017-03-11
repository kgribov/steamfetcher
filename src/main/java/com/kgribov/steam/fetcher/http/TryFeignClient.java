package com.kgribov.steam.fetcher.http;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

public class TryFeignClient {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        DotaFeignClient client = Feign
                .builder()
                .logger(new Slf4jLogger())
                .client(new OkHttpClient())
                .decoder(new JacksonDecoder(mapper))
                .target(DotaFeignClient.class,"https://api.steampowered.com");

        DotaFetchPageJson fetchPageJson = client.fetchDotaMatches("JSON", "", 0L);

        System.out.println(fetchPageJson);
    }
}
