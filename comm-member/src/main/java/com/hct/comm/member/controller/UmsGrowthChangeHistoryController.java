package com.hct.comm.member.controller;

import com.hct.comm.member.entity.UmsGrowthChangeHistory;
import com.hct.comm.member.service.UmsGrowthChangeHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:48:01
 */
@RestController
@RequestMapping("umsGrowthChangeHistory")
public class UmsGrowthChangeHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsGrowthChangeHistory selectOne(Long id) {
        return this.umsGrowthChangeHistoryService.queryById(id);
    }

}