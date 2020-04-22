package com.hct.comm.product.service;

import com.hct.comm.product.entity.PmsAttrAttrgroupRelation;
import java.util.List;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsAttrAttrgroupRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsAttrAttrgroupRelation queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsAttrAttrgroupRelation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    PmsAttrAttrgroupRelation insert(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 修改数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    PmsAttrAttrgroupRelation update(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}