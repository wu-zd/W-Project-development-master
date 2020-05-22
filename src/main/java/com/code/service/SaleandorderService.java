package com.code.service;

import com.code.entity.Saleandorder;
import com.code.entity.SaleandorderSo;
import com.code.entity.filterSos;
import com.code.layuiUtil.SoulPage;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Saleandorder)表服务接口
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
public interface SaleandorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Saleandorder queryById(Integer sid);


    Saleandorder queryLastOne();

    /**
     * 查询多条数据
     *
     * @param
     * @param
     * @return 对象列表
     */
    Object selectAll(SoulPage<Saleandorder> soulPage);

    /**
     * 新增数据
     *
     * @param saleandorder 实例对象
     * @return 实例对象
     */
    Saleandorder insert(Saleandorder saleandorder);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param saleandorder 实例对象
     * @return 对象列表
     */
    List<Saleandorder> queryAll(Saleandorder saleandorder);

//    PageInfo<Saleandorder> selectAllForPage(int pageNum, int pageSize,List<filterSos> filterSosList);
    /**
     * 修改数据
     *
     * @param saleandorder 实例对象
     * @return 实例对象
     */
    Saleandorder update(Saleandorder saleandorder);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sid);

}
