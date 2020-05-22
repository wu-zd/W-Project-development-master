package com.code.service.impl;

import com.code.entity.Product;
import com.code.dao.ProductDao;
import com.code.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Product)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    @Override
    public Product queryById(Integer pid) {
        return this.productDao.queryById(pid);
    }

    /**
     * 查询多条数据
     *
     * @param
     * @param
     * @return 对象列表
     */
    @Override
    public List<Product> selectAll(){
        return this.productDao.selectAll();
    }

    @Override
    public PageInfo<Product> selectAllForPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Product> list=this.productDao.selectAll();
        PageInfo<Product> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }


    /**
     * 通过实体作为筛选条件查询
     *
     * @param product 实例对象
     * @return 对象列表
     */
    @Override
   public List<Product> queryAll(Product product){
        return  this.productDao.queryAll(product);
    }

    @Override
    public PageInfo<Product> queryAllForPage(Integer pageNum, Integer pageSize, Product product) {
        PageHelper.startPage(pageNum,pageSize);
        List<Product> list=this.productDao.queryAll(product);
        PageInfo<Product> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Product product) {
        return   this.productDao.insert(product);
    }

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Product product) {
        
        return this.productDao.update(product);
    }

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pid) {
        return this.productDao.deleteById(pid) > 0;
    }

	@Override
	public List<Product> selectAll2() {
		// TODO Auto-generated method stub
		return this.productDao.selectAll2();
	}
}
