package com.hct.comm.order.dao;

import com.hct.comm.order.entity.OmsPaymentInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 支付信息表(OmsPaymentInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public interface OmsPaymentInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsPaymentInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsPaymentInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param omsPaymentInfo 实例对象
     * @return 对象列表
     */
    List<OmsPaymentInfo> queryAll(OmsPaymentInfo omsPaymentInfo);

    /**
     * 新增数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 影响行数
     */
    int insert(OmsPaymentInfo omsPaymentInfo);

    /**
     * 修改数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 影响行数
     */
    int update(OmsPaymentInfo omsPaymentInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}