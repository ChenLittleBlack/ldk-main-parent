package com.ldk.main.entity;

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
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

}