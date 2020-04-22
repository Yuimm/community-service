package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsCouponSpuRelation;
import com.hct.comm.coupon.service.SmsCouponSpuRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@RestController
@RequestMapping("smsCouponSpuRelation")
public class SmsCouponSpuRelationController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponSpuRelationService smsCouponSpuRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsCouponSpuRelation selectOne(Long id) {
        return this.smsCouponSpuRelationService.queryById(id);
    }

}