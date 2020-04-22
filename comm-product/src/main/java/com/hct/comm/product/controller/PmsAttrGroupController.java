package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsAttrGroup;
import com.hct.comm.product.service.PmsAttrGroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 属性分组(PmsAttrGroup)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsAttrGroup")
public class PmsAttrGroupController {
    /**
     * 服务对象
     */
    @Resource
    private PmsAttrGroupService pmsAttrGroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsAttrGroup selectOne(Long id) {
        return this.pmsAttrGroupService.queryById(id);
    }

}