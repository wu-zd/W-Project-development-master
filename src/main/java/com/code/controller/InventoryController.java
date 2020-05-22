package com.code.controller;

import com.code.entity.Inventory;
import com.code.service.InventoryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Inventory)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("inventory")
public class InventoryController {
    /**
     * 服务对象
     */
    @Resource
    private InventoryService inventoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Inventory selectOne(Integer id) {
        return this.inventoryService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Inventory> selectAll(){
           return this.inventoryService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param inventory 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Inventory>  queryAll(Inventory inventory){
           return this.inventoryService.queryAll(inventory);
    }

}