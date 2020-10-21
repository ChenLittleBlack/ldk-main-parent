package com.ldk.main.service.user;

import com.ldk.main.entity.base.ApiResult;
import com.ldk.main.entity.user.User;
import com.ldk.main.service.base.BaseService;

/**
 * @author czl
 * @description 用户表service
 * @createDate 2020/09/27 16:56
 */
public interface UserService extends BaseService<User, Long> {

    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return
     */
    ApiResult login(String userName, String password);

}
