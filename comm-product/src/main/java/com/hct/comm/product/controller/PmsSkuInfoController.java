package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsSkuInfo;
import com.hct.comm.product.service.PmsSkuInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * sku信息(PmsSkuInfo)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsSkuInfo")
public class PmsSkuInfoController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSkuInfoService pmsSkuInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsSkuInfo selectOne(Long id) {
        return this.pmsSkuInfoService.queryById(id);
    }

}