package com.bibhu.graphql.helloworld;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    @QueryMapping
    public String helloWorld() {
        return "Hello World !!";
    }

    @QueryMapping("sayHelloWorld")
    public String helloWorldAnyName() {
        return "Say Hello World !!";
    }

    @QueryMapping("sayHelloTo")
    public String sayHelloToName(@Argument String name) {
        return "Say Hello World To - " + name;
    }

    @QueryMapping("sayHelloToAny")
    public String sayHelloToAnyName(@Argument("name") String value) {
        return "Say Hello World To - " + value;
    }
}
