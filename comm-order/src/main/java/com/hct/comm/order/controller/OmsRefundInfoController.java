package com.hct.comm.order.controller;

import com.hct.comm.order.entity.OmsRefundInfo;
import com.hct.comm.order.service.OmsRefundInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 退款信息(OmsRefundInfo)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@RestController
@RequestMapping("omsRefundInfo")
public class OmsRefundInfoController {
    /**
     * 服务对象
     */
    @Resource
    private OmsRefundInfoService omsRefundInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OmsRefundInfo selectOne(Long id) {
        return this.omsRefundInfoService.queryById(id);
    }

}