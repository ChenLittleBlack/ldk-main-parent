package com.ldk.main.repository.user;

import com.ldk.main.entity.user.User;
import com.ldk.main.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * @author czl
 * @description 用户表repository
 * @createDate 2020/09/27 16:56
 */
@Repository
public interface UserRepository extends BaseRepository<User, Long> {
}
