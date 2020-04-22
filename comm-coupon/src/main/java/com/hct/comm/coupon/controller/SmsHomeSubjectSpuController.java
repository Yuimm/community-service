package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsHomeSubjectSpu;
import com.hct.comm.coupon.service.SmsHomeSubjectSpuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 专题商品(SmsHomeSubjectSpu)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@RestController
@RequestMapping("smsHomeSubjectSpu")
public class SmsHomeSubjectSpuController {
    /**
     * 服务对象
     */
    @Resource
    private SmsHomeSubjectSpuService smsHomeSubjectSpuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsHomeSubjectSpu selectOne(Long id) {
        return this.smsHomeSubjectSpuService.queryById(id);
    }

}