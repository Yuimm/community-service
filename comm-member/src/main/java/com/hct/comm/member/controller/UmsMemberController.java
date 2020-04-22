package com.hct.comm.member.controller;

import com.hct.comm.member.entity.UmsMember;
import com.hct.comm.member.service.UmsMemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员(UmsMember)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:48:18
 */
@RestController
@RequestMapping("umsMember")
public class UmsMemberController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMember selectOne(Long id) {
        return this.umsMemberService.queryById(id);
    }

}