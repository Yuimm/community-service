package com.hct.comm.product.service;

import com.hct.comm.product.entity.PmsSpuInfoDesc;
import java.util.List;

/**
 * spu信息介绍(PmsSpuInfoDesc)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsSpuInfoDescService {

    /**
     * 通过ID查询单条数据
     *
     * @param spuId 主键
     * @return 实例对象
     */
    PmsSpuInfoDesc queryById(Long spuId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsSpuInfoDesc> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    PmsSpuInfoDesc insert(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 修改数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    PmsSpuInfoDesc update(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 通过主键删除数据
     *
     * @param spuId 主键
     * @return 是否成功
     */
    boolean deleteById(Long spuId);

}