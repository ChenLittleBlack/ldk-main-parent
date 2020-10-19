package com.ldk.main.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * @author czl
 * @description 基础扩展实体
 * @createDate 2020/09/27 16:16
 */
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public class BaseExpandEntity implements Serializable {

    /**
     * 删除标志
     */
    private Integer removeFlag;

    /**
     * 创建人
     */
    @CreatedBy
    private Long creator;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreatedDate
    private Date createTime;

    /**
     * 修改人
     */
    @LastModifiedBy
    private Long modifier;

    /**
     * 修改时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @LastModifiedDate
    private Date modifyTime;

}
