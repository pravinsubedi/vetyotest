package com.asterdio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 12/18/2016.
 */
@SpringBootApplication
@RestController
public class MainClass {

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class,args);
    }
}
