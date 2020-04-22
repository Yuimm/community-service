package com.hct.comm.order.dao;

import com.hct.comm.order.entity.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单退货申请(OmsOrderReturnApply)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public interface OmsOrderReturnApplyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderReturnApply queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsOrderReturnApply> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param omsOrderReturnApply 实例对象
     * @return 对象列表
     */
    List<OmsOrderReturnApply> queryAll(OmsOrderReturnApply omsOrderReturnApply);

    /**
     * 新增数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 影响行数
     */
    int insert(OmsOrderReturnApply omsOrderReturnApply);

    /**
     * 修改数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 影响行数
     */
    int update(OmsOrderReturnApply omsOrderReturnApply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}