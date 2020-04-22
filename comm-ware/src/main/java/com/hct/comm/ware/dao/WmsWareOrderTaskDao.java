package com.hct.comm.ware.dao;

import com.hct.comm.ware.entity.WmsWareOrderTask;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 库存工作单(WmsWareOrderTask)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 13:03:47
 */
public interface WmsWareOrderTaskDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareOrderTask queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WmsWareOrderTask> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wmsWareOrderTask 实例对象
     * @return 对象列表
     */
    List<WmsWareOrderTask> queryAll(WmsWareOrderTask wmsWareOrderTask);

    /**
     * 新增数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 影响行数
     */
    int insert(WmsWareOrderTask wmsWareOrderTask);

    /**
     * 修改数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 影响行数
     */
    int update(WmsWareOrderTask wmsWareOrderTask);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}