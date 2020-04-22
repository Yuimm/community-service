package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsSpuInfo;
import com.hct.comm.product.service.PmsSpuInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu信息(PmsSpuInfo)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsSpuInfo")
public class PmsSpuInfoController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSpuInfoService pmsSpuInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsSpuInfo selectOne(Long id) {
        return this.pmsSpuInfoService.queryById(id);
    }

}