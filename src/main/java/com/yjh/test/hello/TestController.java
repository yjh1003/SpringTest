package com.yjh.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	
	    @ResponseBody
	    @RequestMapping("/hello2")
	    public String helloWorld() {
	        return "Hello World!!";
	    }
	}

