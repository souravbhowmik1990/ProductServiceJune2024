package com.sourav.productservicejune2024.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This class will be hosting a set HTTP API's.
@RestController
@RequestMapping("/say") //Sets an address for methods where data is read
public class SampleController {
    @GetMapping("/hello/{name}/{times}") //{xyz} is a path variable and it should come in curly bracket
    public String sayHello(@PathVariable("name") String name,
                           @PathVariable("times") int times){  //to access the path variable we need to add @PathVariable annotation
        String output = "";
        for (int i = 0; i < times; i++) {
            output += "Cute baby " + name + "!\n";
        }
        return output;
    }
    @GetMapping("/bye")
    public String sayBye(){
        return "Bye Humans!";
    }
}


/*
http://localhost:1010/say/hello

 */