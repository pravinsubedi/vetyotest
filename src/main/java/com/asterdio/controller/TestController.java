package com.asterdio.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;

/**
 * Created by Admin on 12/19/2016.
 */

@Controller
@RequestMapping("/test")
public class TestController {

   @RequestMapping(method = RequestMethod.GET)
    public ModelAndView test(){
        ModelAndView mv=new ModelAndView("index.jsp");
        return mv;
    }
//    public String test(){
//        return "test";
//    }

}
