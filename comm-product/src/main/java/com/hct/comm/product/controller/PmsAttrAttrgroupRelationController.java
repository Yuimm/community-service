package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsAttrAttrgroupRelation;
import com.hct.comm.product.service.PmsAttrAttrgroupRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsAttrAttrgroupRelation")
public class PmsAttrAttrgroupRelationController {
    /**
     * 服务对象
     */
    @Resource
    private PmsAttrAttrgroupRelationService pmsAttrAttrgroupRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsAttrAttrgroupRelation selectOne(Long id) {
        return this.pmsAttrAttrgroupRelationService.queryById(id);
    }

}