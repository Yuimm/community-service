package com.hct.comm.ware.dao;

import com.hct.comm.ware.entity.WmsWareInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 仓库信息(WmsWareInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 13:03:44
 */
public interface WmsWareInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WmsWareInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wmsWareInfo 实例对象
     * @return 对象列表
     */
    List<WmsWareInfo> queryAll(WmsWareInfo wmsWareInfo);

    /**
     * 新增数据
     *
     * @param wmsWareInfo 实例对象
     * @return 影响行数
     */
    int insert(WmsWareInfo wmsWareInfo);

    /**
     * 修改数据
     *
     * @param wmsWareInfo 实例对象
     * @return 影响行数
     */
    int update(WmsWareInfo wmsWareInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}