package com.asterdio.controller;

import com.asterdio.dao.UserDao;
import com.asterdio.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Admin on 12/19/2016.
 */

@Controller
public class RegisterController {


    @Autowired UserDao userDao;
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    @ResponseBody
    public String registerUser(String name,String email,String phone_number,String address){
        User user=new User(name,email,phone_number,address);
        userDao.save(user);
        return "user successfully registered";

    }



}
