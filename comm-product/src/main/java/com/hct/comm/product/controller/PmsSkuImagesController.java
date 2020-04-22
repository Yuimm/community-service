package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsSkuImages;
import com.hct.comm.product.service.PmsSkuImagesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * sku图片(PmsSkuImages)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsSkuImages")
public class PmsSkuImagesController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSkuImagesService pmsSkuImagesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsSkuImages selectOne(Long id) {
        return this.pmsSkuImagesService.queryById(id);
    }

}