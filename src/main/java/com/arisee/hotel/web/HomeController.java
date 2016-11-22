package com.arisee.hotel.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NGOCHUY-PC on 11/22/2016.
 */
@RestController
@RequestMapping("/")
public class HomeController {
    public String helloWorld(){
        return "Hello World";
    }
}
