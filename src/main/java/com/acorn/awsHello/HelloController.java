package com.acorn.awsHello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/hi")
    public String hi(){

        return  "hiview";
    }
}
