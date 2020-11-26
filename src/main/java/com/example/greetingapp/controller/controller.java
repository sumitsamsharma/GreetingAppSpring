package com.example.greetingapp.controller;

import com.example.greetingapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hellocontroller")
public class controller {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello World !!!!!!";
    }


    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " ! ";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " ! ";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastname") String lastName) {
        return "Hello" + firstName + lastName + " ! ";
    }
}