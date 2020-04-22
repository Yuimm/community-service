package com.hct.comm.member.controller;

import com.hct.comm.member.entity.UmsMemberLevel;
import com.hct.comm.member.service.UmsMemberLevelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员等级(UmsMemberLevel)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
@RestController
@RequestMapping("umsMemberLevel")
public class UmsMemberLevelController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberLevelService umsMemberLevelService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMemberLevel selectOne(Long id) {
        return this.umsMemberLevelService.queryById(id);
    }

}