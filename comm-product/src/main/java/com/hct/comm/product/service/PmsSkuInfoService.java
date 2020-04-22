package com.hct.comm.product.service;

import com.hct.comm.product.entity.PmsSkuInfo;
import java.util.List;

/**
 * sku信息(PmsSkuInfo)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsSkuInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    PmsSkuInfo queryById(Long skuId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsSkuInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    PmsSkuInfo insert(PmsSkuInfo pmsSkuInfo);

    /**
     * 修改数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    PmsSkuInfo update(PmsSkuInfo pmsSkuInfo);

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 是否成功
     */
    boolean deleteById(Long skuId);

}