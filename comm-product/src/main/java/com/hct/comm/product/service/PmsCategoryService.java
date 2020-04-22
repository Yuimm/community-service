package com.hct.comm.product.service;

import com.hct.comm.product.entity.PmsCategory;
import java.util.List;

/**
 * 商品三级分类(PmsCategory)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param catId 主键
     * @return 实例对象
     */
    PmsCategory queryById(Long catId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    PmsCategory insert(PmsCategory pmsCategory);

    /**
     * 修改数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    PmsCategory update(PmsCategory pmsCategory);

    /**
     * 通过主键删除数据
     *
     * @param catId 主键
     * @return 是否成功
     */
    boolean deleteById(Long catId);
    //查出所有分类及子分类，以树状结构组装起来
    List<PmsCategory> listWithTree();
}