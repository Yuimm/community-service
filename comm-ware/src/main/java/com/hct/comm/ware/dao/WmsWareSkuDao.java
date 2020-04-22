package com.hct.comm.ware.dao;

import com.hct.comm.ware.entity.WmsWareSku;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品库存(WmsWareSku)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 13:03:47
 */
public interface WmsWareSkuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareSku queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WmsWareSku> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wmsWareSku 实例对象
     * @return 对象列表
     */
    List<WmsWareSku> queryAll(WmsWareSku wmsWareSku);

    /**
     * 新增数据
     *
     * @param wmsWareSku 实例对象
     * @return 影响行数
     */
    int insert(WmsWareSku wmsWareSku);

    /**
     * 修改数据
     *
     * @param wmsWareSku 实例对象
     * @return 影响行数
     */
    int update(WmsWareSku wmsWareSku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}