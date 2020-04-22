package com.hct.comm.order.service;

import com.hct.comm.order.entity.OmsOrderOperateHistory;
import java.util.List;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public interface OmsOrderOperateHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderOperateHistory queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsOrderOperateHistory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    OmsOrderOperateHistory insert(OmsOrderOperateHistory omsOrderOperateHistory);

    /**
     * 修改数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    OmsOrderOperateHistory update(OmsOrderOperateHistory omsOrderOperateHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}