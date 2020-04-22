package com.hct.comm.order.dao;

import com.hct.comm.order.entity.OmsOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单(OmsOrder)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:59:01
 */
public interface OmsOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrder queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param omsOrder 实例对象
     * @return 对象列表
     */
    List<OmsOrder> queryAll(OmsOrder omsOrder);

    /**
     * 新增数据
     *
     * @param omsOrder 实例对象
     * @return 影响行数
     */
    int insert(OmsOrder omsOrder);

    /**
     * 修改数据
     *
     * @param omsOrder 实例对象
     * @return 影响行数
     */
    int update(OmsOrder omsOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}