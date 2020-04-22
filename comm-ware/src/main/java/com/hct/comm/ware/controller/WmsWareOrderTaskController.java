package com.hct.comm.ware.controller;

import com.hct.comm.ware.entity.WmsWareOrderTask;
import com.hct.comm.ware.service.WmsWareOrderTaskService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 库存工作单(WmsWareOrderTask)表控制层
 *
 * @author makejava
 * @since 2020-04-21 13:03:47
 */
@RestController
@RequestMapping("wmsWareOrderTask")
public class WmsWareOrderTaskController {
    /**
     * 服务对象
     */
    @Resource
    private WmsWareOrderTaskService wmsWareOrderTaskService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WmsWareOrderTask selectOne(Long id) {
        return this.wmsWareOrderTaskService.queryById(id);
    }

}