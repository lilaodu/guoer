package com.ruoyi.business.controller;

import com.ruoyi.business.entity.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/go")
    public BaseResponse go (){
        return BaseResponse.success();
    }
}
