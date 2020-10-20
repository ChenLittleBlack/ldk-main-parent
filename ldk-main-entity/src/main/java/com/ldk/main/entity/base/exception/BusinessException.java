package com.ldk.main.entity.base.exception;

/**
 * 业务异常类
 *
 * @author czl
 * @date 2020/10/20 17:49
 */
public class BusinessException extends RuntimeException {

    private String code;

    private Object data;

    public BusinessException() {
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(String code, String message, Object data) {
        super(message);
        this.code = code;
        this.data = data;
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
