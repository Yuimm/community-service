package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsHomeAdv;
import com.hct.comm.coupon.service.SmsHomeAdvService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 首页轮播广告(SmsHomeAdv)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@RestController
@RequestMapping("smsHomeAdv")
public class SmsHomeAdvController {
    /**
     * 服务对象
     */
    @Resource
    private SmsHomeAdvService smsHomeAdvService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsHomeAdv selectOne(Long id) {
        return this.smsHomeAdvService.queryById(id);
    }

}