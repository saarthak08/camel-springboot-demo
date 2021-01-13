package com.sg.gateway;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class GatewayRouter extends RouteBuilder {

    @Value("${service.hello}")
    private String helloService;

    @Value("${service.bye}")
    private String byeService;

    @Override
    public void configure() throws Exception {
        restConfiguration()
                .component("servlet")
                .enableCORS(true);

        rest().get("/hello")
                .route()
                .to("undertow:http://" + helloService+"/greet");

        rest().get("/bye")
                .route()
                .to("undertow:http://" + byeService+"/greet");

    }
}
