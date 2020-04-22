package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsSpuImages;
import com.hct.comm.product.service.PmsSpuImagesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu图片(PmsSpuImages)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsSpuImages")
public class PmsSpuImagesController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSpuImagesService pmsSpuImagesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsSpuImages selectOne(Long id) {
        return this.pmsSpuImagesService.queryById(id);
    }

}