package com.hct.comm.order.controller;

import com.hct.comm.order.entity.OmsPaymentInfo;
import com.hct.comm.order.service.OmsPaymentInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 支付信息表(OmsPaymentInfo)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@RestController
@RequestMapping("omsPaymentInfo")
public class OmsPaymentInfoController {
    /**
     * 服务对象
     */
    @Resource
    private OmsPaymentInfoService omsPaymentInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OmsPaymentInfo selectOne(Long id) {
        return this.omsPaymentInfoService.queryById(id);
    }

}