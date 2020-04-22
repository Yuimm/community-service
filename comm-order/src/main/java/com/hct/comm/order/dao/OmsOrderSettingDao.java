package com.hct.comm.order.dao;

import com.hct.comm.order.entity.OmsOrderSetting;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单配置信息(OmsOrderSetting)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public interface OmsOrderSettingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderSetting queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsOrderSetting> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param omsOrderSetting 实例对象
     * @return 对象列表
     */
    List<OmsOrderSetting> queryAll(OmsOrderSetting omsOrderSetting);

    /**
     * 新增数据
     *
     * @param omsOrderSetting 实例对象
     * @return 影响行数
     */
    int insert(OmsOrderSetting omsOrderSetting);

    /**
     * 修改数据
     *
     * @param omsOrderSetting 实例对象
     * @return 影响行数
     */
    int update(OmsOrderSetting omsOrderSetting);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}