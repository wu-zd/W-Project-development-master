package com.code.service;

import com.code.entity.Invoice;
import java.util.List;

/**
 * (Invoice)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public interface InvoiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Invoice queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Invoice>selectAll();

    /**
     * 新增数据
     *
     * @param invoice 实例对象
     * @return 实例对象
     */
    Invoice insert(Invoice invoice);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param invoice 实例对象
     * @return 对象列表
     */
    List<Invoice> queryAll(Invoice invoice);

    /**
     * 修改数据
     *
     * @param invoice 实例对象
     * @return 实例对象
     */
    Invoice update(Invoice invoice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}