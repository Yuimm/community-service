package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsCouponHistory;
import com.hct.comm.coupon.service.SmsCouponHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@RestController
@RequestMapping("smsCouponHistory")
public class SmsCouponHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponHistoryService smsCouponHistoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsCouponHistory selectOne(Long id) {
        return this.smsCouponHistoryService.queryById(id);
    }

}