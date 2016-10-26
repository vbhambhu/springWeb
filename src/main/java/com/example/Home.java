package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vinod on 26/10/2016.
 */
@Controller
public class Home {

    @RequestMapping(value = "/", method= RequestMethod.GET )
    public String home(){
        return "home";
    }
}
