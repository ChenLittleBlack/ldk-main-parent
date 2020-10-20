package com.ldk.main.service.impl.base;

import com.ldk.main.entity.base.exception.BusinessException;
import com.ldk.main.entity.base.exception.SystemException;
import com.ldk.main.repository.base.BaseRepository;
import com.ldk.main.service.base.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Optional;

/**
 * 基础service实现类
 *
 * @author czl
 * @date 2020/10/19 15:32
 */
public abstract class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

    protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    protected BaseRepository<T, ID> baseRepository;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     * @throws BusinessException
     * @throws SystemException
     */
    @Override
    public T findById(ID id) throws BusinessException, SystemException {
        try {
            Optional<T> optionalT = this.baseRepository.findById(id);
            return optionalT.orElse(null);
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }

}
