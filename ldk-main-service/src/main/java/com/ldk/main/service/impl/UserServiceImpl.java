package com.ldk.main.service.impl;

import com.ldk.main.repository.UserRepository;
import com.ldk.main.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author czl
 * @description 用户表service实现类
 * @createDate 2020/09/28 09:44
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

}