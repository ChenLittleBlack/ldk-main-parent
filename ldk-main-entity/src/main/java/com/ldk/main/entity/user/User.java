package com.ldk.main.entity.user;

import com.ldk.main.entity.base.BaseExpandEntity;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * @author czl
 * @description 用户表
 * @createDate 2020/09/27 16:10
 */
@Entity
@Table(name = "sys_user")
@DynamicUpdate(true)
@DynamicInsert(true)
@Data
public class User extends BaseExpandEntity {

    /**
     * 用户Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 昵称
     */
    @Column(name = "nickName")
    private String nickName;

}
