package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsCommentReplay;
import com.hct.comm.product.service.PmsCommentReplayService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品评价回复关系(PmsCommentReplay)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("pmsCommentReplay")
public class PmsCommentReplayController {
    /**
     * 服务对象
     */
    @Resource
    private PmsCommentReplayService pmsCommentReplayService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PmsCommentReplay selectOne(Long id) {
        return this.pmsCommentReplayService.queryById(id);
    }

}