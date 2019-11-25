package com.lsm.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zuul")
//类名不能为ZuulController,否则启动会报冲突,这个命名在Zuul组件中已经存在
public class BaseController {

    @RequestMapping(value = "/forward", method = RequestMethod.GET)
    public String forward() {
        return "zuul";
    }
}
