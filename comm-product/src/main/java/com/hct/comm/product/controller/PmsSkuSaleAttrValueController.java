package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsSkuSaleAttrValue;
import com.hct.comm.product.service.PmsSkuSaleAttrValueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsSkuSaleAttrValue")
public class PmsSkuSaleAttrValueController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSkuSaleAttrValueService pmsSkuSaleAttrValueService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsSkuSaleAttrValue selectOne(Long id) {
        return this.pmsSkuSaleAttrValueService.queryById(id);
    }

}