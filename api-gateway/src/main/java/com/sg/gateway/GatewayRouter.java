package com.sg.gateway;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GatewayRouter extends RouteBuilder {

    CamelContext context;

    @Autowired
    public GatewayRouter(CamelContext context) {
        this.context = context;
    }

    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("servlet")
                .enableCORS(true);


        rest().get("/hello")
                .route()
                .serviceCall("hello-service/greet");

        rest().get("/bye")
                .route()
                .serviceCall("bye-service/greet");

    }
}
