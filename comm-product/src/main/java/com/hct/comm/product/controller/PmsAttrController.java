package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsAttr;
import com.hct.comm.product.service.PmsAttrService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品属性(PmsAttr)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:31
 */
@RestController
@RequestMapping("pmsAttr")
public class PmsAttrController {
    /**
     * 服务对象
     */
    @Resource
    private PmsAttrService pmsAttrService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("select")
    @ResponseBody
    public PmsAttr selectOne(Long id) {
        System.out.println("--------------");
        PmsAttr p = pmsAttrService.queryById(id);
        return p;
    }

}