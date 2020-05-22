package com.code.controller;

import com.code.entity.Dengji;
import com.code.service.DengjiService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * (Dengji)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("dengji")
public class DengjiController {
    /**
     * 服务对象
     */
    @Resource
    private DengjiService dengjiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public Dengji queryById(int djid) {
    	Dengji dengji=this.dengjiService.queryById(djid);
        return dengji;
    }
    
   //修改后
    @RequestMapping("/updatedj")
	public @ResponseBody String updatedj(HttpServletRequest request, Dengji dengji){
		int row = this.dengjiService.update(dengji);
		return row>0?"修改成功":"修改失败";
	}
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Dengji> selectAll(){
           return this.dengjiService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param dengji 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public Map<String, Object>  queryAll(Dengji dengji){
    	System.out.println(dengji);
    	List<Dengji> list=this.dengjiService.queryAll(dengji);
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }
    
    //添加
    @RequestMapping(value="/insertdj",produces ="html/text;charset=UTF-8")
	public @ResponseBody  String insertdj(HttpServletRequest request, Dengji dengji) {
		int row=this.dengjiService.insert(dengji);
		return row>0?"添加成功":"添加失败";
	}
   
    //删除
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int id) {
  		int row=this.dengjiService.deleteById(id);
  		return row>0?"删除成功":"删除失败";
  	}

}