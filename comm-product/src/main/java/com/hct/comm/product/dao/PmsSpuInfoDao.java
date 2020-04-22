package com.hct.comm.product.dao;

import com.hct.comm.product.entity.PmsSpuInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * spu信息(PmsSpuInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsSpuInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsSpuInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pmsSpuInfo 实例对象
     * @return 对象列表
     */
    List<PmsSpuInfo> queryAll(PmsSpuInfo pmsSpuInfo);

    /**
     * 新增数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 影响行数
     */
    int insert(PmsSpuInfo pmsSpuInfo);

    /**
     * 修改数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 影响行数
     */
    int update(PmsSpuInfo pmsSpuInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}