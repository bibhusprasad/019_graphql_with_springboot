package com.bibhu.graphql.sec01.lec01;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.concurrent.ThreadLocalRandom;

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

    @QueryMapping("randomNo")
    public int generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt(1, 100);
    }
}
