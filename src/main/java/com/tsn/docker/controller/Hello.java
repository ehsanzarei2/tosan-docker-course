package com.tsn.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ehsan Zarei
 * @since 1/10/2023
 */
@RestController
@RequestMapping("")
public class Hello {

    @GetMapping("/hello")
    public String getHello(@RequestParam(defaultValue = "Stranger", name = "name") String name) {
        return "Hello ".concat(name);
    }


    @GetMapping("/author")
    public String getAuthor() {
        return "Ehsan Zarei";
    }

}
