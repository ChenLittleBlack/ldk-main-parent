package com.ldk.main.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * 基础repository
 *
 * @author czl
 * @date 2020/10/19 15:46
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>, PagingAndSortingRepository<T, ID> {

    /**
     * 批量保存
     *
     * @param var1
     * @param <S>
     * @return
     */
    <S extends T> Iterable<S> batchSave(Iterable<S> var1);

    /**
     * 批量更新
     *
     * @param var1
     * @param <S>
     * @return
     */
    <S extends T> Iterable<S> batchUpdate(Iterable<S> var1);

}
