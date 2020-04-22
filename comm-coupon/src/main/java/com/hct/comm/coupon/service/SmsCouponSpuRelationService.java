package com.hct.comm.coupon.service;

import com.hct.comm.coupon.entity.SmsCouponSpuRelation;
import java.util.List;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public interface SmsCouponSpuRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsCouponSpuRelation queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmsCouponSpuRelation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    SmsCouponSpuRelation insert(SmsCouponSpuRelation smsCouponSpuRelation);

    /**
     * 修改数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    SmsCouponSpuRelation update(SmsCouponSpuRelation smsCouponSpuRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}