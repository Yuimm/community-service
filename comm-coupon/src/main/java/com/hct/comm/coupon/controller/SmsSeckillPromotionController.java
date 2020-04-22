package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsSeckillPromotion;
import com.hct.comm.coupon.service.SmsSeckillPromotionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀活动(SmsSeckillPromotion)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@RestController
@RequestMapping("smsSeckillPromotion")
public class SmsSeckillPromotionController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillPromotionService smsSeckillPromotionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsSeckillPromotion selectOne(Long id) {
        return this.smsSeckillPromotionService.queryById(id);
    }

}