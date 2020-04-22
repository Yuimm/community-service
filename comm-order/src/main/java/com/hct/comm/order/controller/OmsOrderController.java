package com.hct.comm.order.controller;

import com.hct.comm.order.entity.OmsOrder;
import com.hct.comm.order.service.OmsOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单(OmsOrder)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:59:03
 */
@RestController
@RequestMapping("omsOrder")
public class OmsOrderController {
    /**
     * 服务对象
     */
    @Resource
    private OmsOrderService omsOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OmsOrder selectOne(Long id) {
        return this.omsOrderService.queryById(id);
    }

}