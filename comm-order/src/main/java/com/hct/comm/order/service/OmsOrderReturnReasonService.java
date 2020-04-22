package com.hct.comm.order.service;

import com.hct.comm.order.entity.OmsOrderReturnReason;
import java.util.List;

/**
 * 退货原因(OmsOrderReturnReason)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public interface OmsOrderReturnReasonService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderReturnReason queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsOrderReturnReason> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 实例对象
     */
    OmsOrderReturnReason insert(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * 修改数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 实例对象
     */
    OmsOrderReturnReason update(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}