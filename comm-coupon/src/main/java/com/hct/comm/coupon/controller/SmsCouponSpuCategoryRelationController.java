package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsCouponSpuCategoryRelation;
import com.hct.comm.coupon.service.SmsCouponSpuCategoryRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@RestController
@RequestMapping("smsCouponSpuCategoryRelation")
public class SmsCouponSpuCategoryRelationController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponSpuCategoryRelationService smsCouponSpuCategoryRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsCouponSpuCategoryRelation selectOne(Long id) {
        return this.smsCouponSpuCategoryRelationService.queryById(id);
    }

}