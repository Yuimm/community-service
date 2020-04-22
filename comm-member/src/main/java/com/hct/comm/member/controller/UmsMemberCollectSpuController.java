package com.hct.comm.member.controller;

import com.hct.comm.member.entity.UmsMemberCollectSpu;
import com.hct.comm.member.service.UmsMemberCollectSpuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
@RestController
@RequestMapping("umsMemberCollectSpu")
public class UmsMemberCollectSpuController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberCollectSpuService umsMemberCollectSpuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMemberCollectSpu selectOne(Long id) {
        return this.umsMemberCollectSpuService.queryById(id);
    }

}