package com.ldk.main.service.base;

import com.ldk.main.entity.base.exception.BusinessException;
import com.ldk.main.entity.base.exception.SystemException;

import java.io.Serializable;

/**
 * 基础service
 *
 * @author czl
 * @date 2020/10/19 15:29
 */
public interface BaseService<T, ID extends Serializable> {

    /**
     * 根据id查询
     *
     * @param id
     * @return
     * @throws BusinessException
     * @throws SystemException
     */
    T findById(ID id) throws BusinessException, SystemException;

}

