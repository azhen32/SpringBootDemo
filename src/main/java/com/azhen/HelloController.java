package com.azhen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by azhen on 17-2-5.
 */

/**
 * @RestController相当于@Controller+@ResponseBody
 */
//@RestController
@Controller
public class HelloController {
    @Autowired
    private BoyProperty boyProperty;

    @Value("${cupSize}")
    private String cupSize;
    @Value("${age}")
    private Integer age;
    @Value("content")
    private String content;
    //@RequestMapping(value = {"/hello","/hi"},method = RequestMethod.POST)
    public String say() {
        return "index";
        //return boyProperty.getCupSize();
    }
}
