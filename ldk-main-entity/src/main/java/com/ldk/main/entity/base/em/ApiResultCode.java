package com.ldk.main.entity.base.em;

import lombok.Getter;

/**
 * 接口返回结果-状态码枚举
 *
 * @author czl
 * @date 2020/10/20 17:03
 */
@Getter
public enum ApiResultCode {

    /**
     * 成功: 200
     */
    SUCCESS(200, "成功"),

    /**
     * 禁止访问: 403
     */
    ACCESS_ERROR(403, "禁止访问"),

    /**
     * 找不到页面: 404
     */
    NOT_FOUND(404, "找不到页面"),

    /**
     * 系统异常: 500
     */
    SYSTEM_ERROR(500, "系统异常"),

    /**
     * 业务异常: 501
     */
    BUSINESS_ERROR(501, "业务异常"),

    /**
     * 参数错误: 1001-1999
     */
    PARAM_IS_INVALID(1001, "参数无效"),
    PARAM_IS_BLANK(1002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(1003, "参数类型错误"),
    PARAM_NOT_COMPLETE(1004, "参数缺失"),

    /**
     * 用户错误: 2001-2999
     */
    USER_NOT_LOGGED_IN(2001, "用户未登录,访问的路径需要验证,请登录"),
    USER_LOGIN_ERROR(2002, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(2003, "账号已被禁用"),
    USER_NOT_EXIST(2004, "用户不存在"),
    USER_HAS_EXISTED(2005, "用户已存在"),

    /**
     * 未知: -1
     */
    UNKNOWN(-1, "未知");

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 信息
     */
    private String message;

    ApiResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
