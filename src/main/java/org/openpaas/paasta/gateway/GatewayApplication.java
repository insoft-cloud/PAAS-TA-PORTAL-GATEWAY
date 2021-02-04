package org.openpaas.paasta.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * The type Application.
 *
 * EnableZuulProxy
 * zuul 서버를 사용.
 *
 * EnableEurekaServer
 * EurekaServer 로 사용 할것을 선언한다.
 *
 * EnableDiscoveryClient
 * EurekaClient 를 등록한다.
 *
 */
@EnableHystrix
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}

