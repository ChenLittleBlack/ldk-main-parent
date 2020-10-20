package com.ldk.main.entity.base;

import com.ldk.main.entity.base.em.ApiResultCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 接口返回结果实体
 *
 * @author czl
 * @date 2020/10/20 16:58
 */
@Data
public class ApiResult implements Serializable {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 信息
     */
    private String message;

    /**
     * 数据
     */
    private Object data;

    /**
     * 无参构造函数
     */
    public ApiResult() {
    }

    /**
     * 构造函数
     *
     * @param code
     * @param message
     * @param data
     */
    public ApiResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 构造函数
     *
     * @param apiResultCode
     */
    public ApiResult(ApiResultCode apiResultCode) {
        this.code = apiResultCode.getCode();
        this.message = apiResultCode.getMessage();
        this.data = null;
    }

    /**
     * 成功
     *
     * @param message
     * @param data
     * @return
     */
    public static ApiResult success(String message, Object data) {
        return new ApiResult(ApiResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 成功
     *
     * @param message
     * @return
     */
    public static ApiResult success(String message) {
        return new ApiResult(ApiResultCode.SUCCESS.getCode(), message, null);
    }

    /**
     * 成功
     *
     * @param data
     * @return
     */
    public static ApiResult success(Object data) {
        return new ApiResult(ApiResultCode.SUCCESS.getCode(), ApiResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功
     *
     * @return
     */
    public static ApiResult success() {
        return new ApiResult(ApiResultCode.SUCCESS.getCode(), ApiResultCode.SUCCESS.getMessage(), null);
    }

}
