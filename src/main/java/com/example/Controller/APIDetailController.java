package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by byhieg on 17/1/2.
 * Mail to byhieg@gmail.com
 */
@Controller
@RequestMapping("/apiManage/apiDetail")
public class APIDetailController {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getDetail(@PathVariable("id")String id ){
        return "detail";
    }
}
