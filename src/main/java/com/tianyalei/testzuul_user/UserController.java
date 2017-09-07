package com.tianyalei.testzuul_user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("user")
    public String index() {
        return "hello，我来自User客户端";
    }
}
