package com.hct.comm.ware.controller;

import com.hct.comm.ware.entity.WmsWareInfo;
import com.hct.comm.ware.service.WmsWareInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 仓库信息(WmsWareInfo)表控制层
 *
 * @author makejava
 * @since 2020-04-21 13:03:46
 */
@RestController
@RequestMapping("wmsWareInfo")
public class WmsWareInfoController {
    /**
     * 服务对象
     */
    @Resource
    private WmsWareInfoService wmsWareInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WmsWareInfo selectOne(Long id) {
        return this.wmsWareInfoService.queryById(id);
    }

}