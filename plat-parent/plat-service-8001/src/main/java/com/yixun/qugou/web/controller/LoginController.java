package com.yixun.qugou.web.controller;

import com.yixun.qugou.domain.User;
import com.yixun.qugou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if("admin".equals(user.getUsername())&&"263265".equals(user.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMessage("登录失败");
        }
    }
}
