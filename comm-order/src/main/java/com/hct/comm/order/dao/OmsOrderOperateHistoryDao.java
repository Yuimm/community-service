package com.hct.comm.order.dao;

import com.hct.comm.order.entity.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public interface OmsOrderOperateHistoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderOperateHistory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsOrderOperateHistory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 对象列表
     */
    List<OmsOrderOperateHistory> queryAll(OmsOrderOperateHistory omsOrderOperateHistory);

    /**
     * 新增数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 影响行数
     */
    int insert(OmsOrderOperateHistory omsOrderOperateHistory);

    /**
     * 修改数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 影响行数
     */
    int update(OmsOrderOperateHistory omsOrderOperateHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}