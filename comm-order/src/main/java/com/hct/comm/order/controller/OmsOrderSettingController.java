package com.hct.comm.order.controller;

import com.hct.comm.order.entity.OmsOrderSetting;
import com.hct.comm.order.service.OmsOrderSettingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单配置信息(OmsOrderSetting)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@RestController
@RequestMapping("omsOrderSetting")
public class OmsOrderSettingController {
    /**
     * 服务对象
     */
    @Resource
    private OmsOrderSettingService omsOrderSettingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OmsOrderSetting selectOne(Long id) {
        return this.omsOrderSettingService.queryById(id);
    }

}