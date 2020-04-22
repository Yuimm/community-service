package com.hct.comm.order.service;

import com.hct.comm.order.entity.OmsRefundInfo;
import java.util.List;

/**
 * 退款信息(OmsRefundInfo)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
public interface OmsRefundInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsRefundInfo queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OmsRefundInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    OmsRefundInfo insert(OmsRefundInfo omsRefundInfo);

    /**
     * 修改数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    OmsRefundInfo update(OmsRefundInfo omsRefundInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}