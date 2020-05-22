package com.code.dao;

import com.code.entity.Supplier;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Supplier)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public interface SupplierDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Supplier queryById(Integer sid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Supplier> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param supplier 实例对象
     * @return 对象列表
     */
    List<Supplier> queryAll(Supplier supplier);

    /**
     * 新增数据
     *
     * @param supplier 实例对象
     * @return 影响行数
     */
    int insert(Supplier supplier);

    /**
     * 修改数据
     *
     * @param supplier 实例对象
     * @return 影响行数
     */
    int update(Supplier supplier);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 影响行数
     */
    int deleteById(Integer sid);

}