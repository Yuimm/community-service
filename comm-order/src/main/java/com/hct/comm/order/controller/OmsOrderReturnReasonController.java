package com.hct.comm.order.controller;

import com.hct.comm.order.entity.OmsOrderReturnReason;
import com.hct.comm.order.service.OmsOrderReturnReasonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 退货原因(OmsOrderReturnReason)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@RestController
@RequestMapping("omsOrderReturnReason")
public class OmsOrderReturnReasonController {
    /**
     * 服务对象
     */
    @Resource
    private OmsOrderReturnReasonService omsOrderReturnReasonService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OmsOrderReturnReason selectOne(Long id) {
        return this.omsOrderReturnReasonService.queryById(id);
    }

}