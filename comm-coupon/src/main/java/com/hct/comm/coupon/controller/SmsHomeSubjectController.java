package com.hct.comm.coupon.controller;

import com.hct.comm.coupon.entity.SmsHomeSubject;
import com.hct.comm.coupon.service.SmsHomeSubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@RestController
@RequestMapping("smsHomeSubject")
public class SmsHomeSubjectController {
    /**
     * 服务对象
     */
    @Resource
    private SmsHomeSubjectService smsHomeSubjectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SmsHomeSubject selectOne(Long id) {
        return this.smsHomeSubjectService.queryById(id);
    }

}