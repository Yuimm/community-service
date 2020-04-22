package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsSeckillSkuNotice;
import com.hct.comm.coupon.service.SmsSeckillSkuNoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@RestController
@RequestMapping("smsSeckillSkuNotice")
public class SmsSeckillSkuNoticeController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillSkuNoticeService smsSeckillSkuNoticeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsSeckillSkuNotice selectOne(Long id) {
        return this.smsSeckillSkuNoticeService.queryById(id);
    }

}