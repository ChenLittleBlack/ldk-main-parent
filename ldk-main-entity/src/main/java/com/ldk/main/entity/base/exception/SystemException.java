package com.ldk.main.entity.base.exception;

/**
 * 系统异常类
 *
 * @author czl
 * @date 2020/10/20 17:50
 */
public class SystemException extends RuntimeException {

    public SystemException() {
    }

    public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

}

