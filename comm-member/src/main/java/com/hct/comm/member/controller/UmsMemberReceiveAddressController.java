package com.hct.comm.member.controller;

import com.hct.comm.member.entity.UmsMemberReceiveAddress;
import com.hct.comm.member.service.UmsMemberReceiveAddressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员收货地址(UmsMemberReceiveAddress)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
@RestController
@RequestMapping("umsMemberReceiveAddress")
public class UmsMemberReceiveAddressController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMemberReceiveAddress selectOne(Long id) {
        return this.umsMemberReceiveAddressService.queryById(id);
    }

}