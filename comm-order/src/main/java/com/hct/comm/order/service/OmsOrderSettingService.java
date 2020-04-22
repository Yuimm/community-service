package com.hct.comm.order.service;

import com.hct.comm.order.entity.OmsOrderSetting;
import java.util.List;

/**
 * 订单配置信息(OmsOrderSetting)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public interface OmsOrderSettingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderSetting queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsOrderSetting> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    OmsOrderSetting insert(OmsOrderSetting omsOrderSetting);

    /**
     * 修改数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    OmsOrderSetting update(OmsOrderSetting omsOrderSetting);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}