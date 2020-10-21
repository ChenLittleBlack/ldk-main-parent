package com.ldk.main.web.base;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 基础controller
 *
 * @author czl
 * @date 2020/10/21 9:54
 */
@MappedSuperclass
public abstract class BaseController<T, ID extends Serializable> {
}
