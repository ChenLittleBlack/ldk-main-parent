package com.ldk.main.web.user;

import com.ldk.main.entity.base.ApiResult;
import com.ldk.main.entity.base.exception.BusinessException;
import com.ldk.main.entity.base.exception.SystemException;
import com.ldk.main.entity.user.User;
import com.ldk.main.service.user.UserService;
import com.ldk.main.web.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author czl
 * @description 用户表controller
 * @createDate 2020/09/28 10:16
 */
@Controller
@RequestMapping("user/userAction")
public class UserController extends BaseController<User, Long> {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    private ApiResult login(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "password") String password
    ) {
        try {
            return userService.login(userName, password);
        } catch (BusinessException e) {
            return ApiResult.businessError(e.getMessage());
        } catch (SystemException e) {
            return ApiResult.systemError(e.getMessage());
        }
    }

}
