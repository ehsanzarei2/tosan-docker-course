package com.tsn.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author Ehsan Zarei
 * @since 1/10/2023
 */
@RestController
@RequestMapping("")
public class Hello {

    private static final String regEx = "(?=\\p{Lu})";

    @GetMapping("/hello")
    public String getHello(@RequestParam(defaultValue = "Stranger", name = "name") String name) {
        var resultName = Arrays.stream(name.split(regEx))
                .reduce("", (a, b) -> a.concat(" ").concat(b));
        return "Hello ".concat(resultName);
    }


    @GetMapping("/author")
    public String getAuthor() {
        return "Ehsan Zarei";
    }

}
