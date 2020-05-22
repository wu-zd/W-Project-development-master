package com.code.service.impl;

import com.code.entity.Invoice;
import com.code.dao.InvoiceDao;
import com.code.service.InvoiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Invoice)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@Service("invoiceService")
public class InvoiceServiceImpl implements InvoiceService {
    @Resource
    private InvoiceDao invoiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Invoice queryById(Integer id) {
        return this.invoiceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Invoice> selectAll(){
        return this.invoiceDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param invoice 实例对象
     * @return 对象列表
     */
    @Override
   public List<Invoice> queryAll(Invoice invoice){
          return  this.invoiceDao.queryAll(invoice);
    }

    /**
     * 新增数据
     *
     * @param invoice 实例对象
     * @return 实例对象
     */
    @Override
    public Invoice insert(Invoice invoice) {
        this.invoiceDao.insert(invoice);
        return invoice;
    }

    /**
     * 修改数据
     *
     * @param invoice 实例对象
     * @return 实例对象
     */
    @Override
    public Invoice update(Invoice invoice) {
        this.invoiceDao.update(invoice);
        return this.queryById(invoice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.invoiceDao.deleteById(id) > 0;
    }
}