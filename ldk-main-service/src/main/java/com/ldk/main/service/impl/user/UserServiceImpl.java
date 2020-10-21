package com.ldk.main.service.impl.user;

import com.ldk.main.entity.base.ApiResult;
import com.ldk.main.entity.base.exception.BusinessException;
import com.ldk.main.entity.user.User;
import com.ldk.main.repository.user.UserRepository;
import com.ldk.main.service.impl.base.BaseServiceImpl;
import com.ldk.main.service.user.UserService;
import org.springframework.stereotype.Service;

/**
 * @author czl
 * @description 用户表service实现类
 * @createDate 2020/09/28 09:44
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {

    private UserRepository userRepository;

    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return
     */
    @Override
    public ApiResult login(String userName, String password) {
        User user = this.findById(1L);
        if (!userName.equals(user.getUserName()) || !password.equals(user.getPassword())) {
            throw new BusinessException("账号或密码错误");
        }
        return ApiResult.success("登录成功");
    }
}
