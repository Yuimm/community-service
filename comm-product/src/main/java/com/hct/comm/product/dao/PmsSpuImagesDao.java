package com.hct.comm.product.dao;

import com.hct.comm.product.entity.PmsSpuImages;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * spu图片(PmsSpuImages)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsSpuImagesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuImages queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsSpuImages> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pmsSpuImages 实例对象
     * @return 对象列表
     */
    List<PmsSpuImages> queryAll(PmsSpuImages pmsSpuImages);

    /**
     * 新增数据
     *
     * @param pmsSpuImages 实例对象
     * @return 影响行数
     */
    int insert(PmsSpuImages pmsSpuImages);

    /**
     * 修改数据
     *
     * @param pmsSpuImages 实例对象
     * @return 影响行数
     */
    int update(PmsSpuImages pmsSpuImages);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}