package com.zhengcq.srv.client1.controller;

import com.zhengcq.srv.client1.model.User;
import com.zhengcq.srv.client1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rb-client1")
public class UserController  {
    @Autowired
    private UserService userService;

    @GetMapping("/get-by-id")
    public String getById(@RequestParam("userId")Long userId){
        User user = userService.getByUserId(userId);

        if(user != null) {
            return user.getName();
        }else {
            return "not found";
        }
    }
}
