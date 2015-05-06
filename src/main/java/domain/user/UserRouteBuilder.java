package domain.user;

import domain.Config;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

/**
 * Created by nakamurajun on 2015/05/06.
 */
public class UserRouteBuilder extends RouteBuilder {

    @Override
    public void configure() {

        restConfiguration()
                .component("jetty")
                .bindingMode(RestBindingMode.json)
                .port(Config.getPort())
                .host("localhost")
        ;

        rest("/")
                .description("welcom point")
                .produces("application/json")
                .get("")
                .outType(String.class)
                .route()
                .transform()
                .constant("welcome");

        rest("/user")
                .description("user api")
                .consumes("application/json")
                .produces("application/json")

                .get("/{id}")
                .description("find user by id.")
                .outType(User.class)
                .to("bean:userService?method=findById(${header.id})")

                .get("/all")
                .description("find all users.")
                .outTypeList(User.class)
                .to("bean:userService?method=findAll")
         ;
    }
}
