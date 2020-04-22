package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsSeckillSession;
import com.hct.comm.coupon.service.SmsSeckillSessionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀活动场次(SmsSeckillSession)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@RestController
@RequestMapping("smsSeckillSession")
public class SmsSeckillSessionController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillSessionService smsSeckillSessionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsSeckillSession selectOne(Long id) {
        return this.smsSeckillSessionService.queryById(id);
    }

}