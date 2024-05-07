// camel-k: language=java

import org.apache.camel.builder.RouteBuilder;

public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Write your routes here, for example:
        from("kamelet:log-source?message=Hello World").log("${body}");
    }
}
