package com.hct.comm.member.controller;

import com.hct.comm.member.entity.UmsMemberCollectSubject;
import com.hct.comm.member.service.UmsMemberCollectSubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
@RestController
@RequestMapping("umsMemberCollectSubject")
public class UmsMemberCollectSubjectController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberCollectSubjectService umsMemberCollectSubjectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMemberCollectSubject selectOne(Long id) {
        return this.umsMemberCollectSubjectService.queryById(id);
    }

}