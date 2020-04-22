package com.hct.comm.product.service;

import com.hct.comm.product.entity.PmsAttrGroup;
import java.util.List;

/**
 * 属性分组(PmsAttrGroup)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsAttrGroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param attrGroupId 主键
     * @return 实例对象
     */
    PmsAttrGroup queryById(Long attrGroupId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsAttrGroup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    PmsAttrGroup insert(PmsAttrGroup pmsAttrGroup);

    /**
     * 修改数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    PmsAttrGroup update(PmsAttrGroup pmsAttrGroup);

    /**
     * 通过主键删除数据
     *
     * @param attrGroupId 主键
     * @return 是否成功
     */
    boolean deleteById(Long attrGroupId);

}