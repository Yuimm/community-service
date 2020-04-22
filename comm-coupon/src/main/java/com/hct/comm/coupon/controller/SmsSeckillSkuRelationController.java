package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsSeckillSkuRelation;
import com.hct.comm.coupon.service.SmsSeckillSkuRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:53
 */
@RestController
@RequestMapping("smsSeckillSkuRelation")
public class SmsSeckillSkuRelationController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillSkuRelationService smsSeckillSkuRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsSeckillSkuRelation selectOne(Long id) {
        return this.smsSeckillSkuRelationService.queryById(id);
    }

}