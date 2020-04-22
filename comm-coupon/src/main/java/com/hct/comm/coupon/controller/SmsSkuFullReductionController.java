package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsSkuFullReduction;
import com.hct.comm.coupon.service.SmsSkuFullReductionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品满减信息(SmsSkuFullReduction)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:53
 */
@RestController
@RequestMapping("smsSkuFullReduction")
public class SmsSkuFullReductionController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSkuFullReductionService smsSkuFullReductionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsSkuFullReduction selectOne(Long id) {
        return this.smsSkuFullReductionService.queryById(id);
    }

}