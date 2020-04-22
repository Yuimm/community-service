package com.hct.comm.product.dao;

import com.hct.comm.product.entity.PmsSkuSaleAttrValue;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsSkuSaleAttrValueDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSkuSaleAttrValue queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsSkuSaleAttrValue> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 对象列表
     */
    List<PmsSkuSaleAttrValue> queryAll(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 新增数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 影响行数
     */
    int insert(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 修改数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 影响行数
     */
    int update(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}