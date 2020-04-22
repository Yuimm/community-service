package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsCoupon;
import com.hct.comm.coupon.service.SmsCouponService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 优惠券信息(SmsCoupon)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:50
 */
@RestController
@RequestMapping("smsCoupon")
public class SmsCouponController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponService smsCouponService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsCoupon selectOne(Long id) {
        return this.smsCouponService.queryById(id);
    }

}