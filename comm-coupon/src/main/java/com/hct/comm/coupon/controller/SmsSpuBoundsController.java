package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsSpuBounds;
import com.hct.comm.coupon.service.SmsSpuBoundsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品spu积分设置(SmsSpuBounds)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:53
 */
@RestController
@RequestMapping("smsSpuBounds")
public class SmsSpuBoundsController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSpuBoundsService smsSpuBoundsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsSpuBounds selectOne(Long id) {
        return this.smsSpuBoundsService.queryById(id);
    }

}