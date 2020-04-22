package com.hct.comm.product.controller;

import com.hct.comm.product.entity.PmsCategory;
import com.hct.comm.product.service.PmsCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.ws.ResponseWrapper;
import java.util.List;

/**
 * 商品三级分类(PmsCategory)表控制层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@RestController
@RequestMapping("/product/category")
public class PmsCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private PmsCategoryService pmsCategoryService;

    /**
     * 查出所有分类及子分类，以树状结构组装起来
     */
    @RequestMapping("list/tree")
    @ResponseBody
    public List<PmsCategory> selectOne(Long id) {
        List<PmsCategory> pmsCategories = pmsCategoryService.listWithTree();
        return pmsCategories;
    }

}