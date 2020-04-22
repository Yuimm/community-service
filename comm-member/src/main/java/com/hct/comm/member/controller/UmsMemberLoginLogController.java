package com.hct.comm.member.controller;

import com.hct.comm.member.entity.UmsMemberLoginLog;
import com.hct.comm.member.service.UmsMemberLoginLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员登录记录(UmsMemberLoginLog)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
@RestController
@RequestMapping("umsMemberLoginLog")
public class UmsMemberLoginLogController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberLoginLogService umsMemberLoginLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMemberLoginLog selectOne(Long id) {
        return this.umsMemberLoginLogService.queryById(id);
    }

}