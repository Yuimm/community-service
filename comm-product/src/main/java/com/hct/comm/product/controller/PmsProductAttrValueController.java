package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsProductAttrValue;
import com.hct.comm.product.service.PmsProductAttrValueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu属性值(PmsProductAttrValue)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsProductAttrValue")
public class PmsProductAttrValueController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductAttrValueService pmsProductAttrValueService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsProductAttrValue selectOne(Long id) {
        return this.pmsProductAttrValueService.queryById(id);
    }

}