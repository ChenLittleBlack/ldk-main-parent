package com.ldk.main.entity.base.handler;

import com.ldk.main.entity.base.ApiResult;
import com.ldk.main.entity.base.ann.ResponseApiResult;
import com.ldk.main.entity.base.exception.BusinessException;
import com.ldk.main.entity.base.exception.SystemException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * ApiResult接口Handler
 *
 * @author czl
 * @date 2020/10/21 10:19
 */
@Slf4j
@ControllerAdvice
public class ResponseApiResultHandler implements ResponseBodyAdvice<Object> {

    /**
     * 标记名称
     */
    public static final String RESPONSE_RESULT_ANN = "RESPONSE-RESULT-ANN";

    /**
     * 是否请求包含了包装注解标记，没有就直接返回，不需要重写返回体
     *
     * @param returnType
     * @param converterType
     * @return
     */
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        ServletRequestAttributes sra = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
        HttpServletRequest request = sra.getRequest();
        // 判断请求是否有包装标记
        ResponseApiResult responseApiResultAnn = (ResponseApiResult) request.getAttribute(RESPONSE_RESULT_ANN);
        return responseApiResultAnn != null;
    }

    /**
     *
     * @param body
     * @param returnType
     * @param selectedContentType
     * @param selectedConverterType
     * @param request
     * @param response
     * @return
     */
    @Override
    public Object beforeBodyWrite(
            Object body, MethodParameter returnType,
            MediaType selectedContentType,
            Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
            ServerHttpResponse response
    ) {
        log.info("#######进入返回体,重写格式处理中#######");
        if (body instanceof BusinessException || body instanceof SystemException) {
            log.info("#######返回值,异常包装处理中#######");
            if (body instanceof BusinessException) {
                BusinessException e = (BusinessException) body;
                throw new BusinessException(e.getMessage());
            } else if (body instanceof SystemException) {
                SystemException e = (SystemException) body;
                throw new SystemException(e.getMessage());
            }
        }
        return ApiResult.success(body);
    }
}
