package com.ldk.main.web.user;

import com.ldk.main.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author czl
 * @description 用户表controller
 * @createDate 2020/09/28 10:16
 */
@Controller
@RequestMapping("user/userAction")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    private void login(String userName, String password) {

    }

}
