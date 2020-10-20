package com.ldk.main.service.impl;

import com.ldk.main.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * 基础service实现类
 *
 * @author czl
 * @date 2020/10/19 15:32
 */
public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

    protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

}
