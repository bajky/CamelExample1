package serverRoutes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ServerRoutes extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("jms:queue:numbers").to("bean:multiplier");
    }

}