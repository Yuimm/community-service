package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsBrand;
import com.hct.comm.product.service.PmsBrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 品牌(PmsBrand)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsBrand")
public class PmsBrandController {
    /**
     * 服务对象
     */
    @Resource
    private PmsBrandService pmsBrandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("insert")
    public void insert() {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setName("华为");
        pmsBrandService.insert(pmsBrand);

        System.out.println("插入成功");

    }

}