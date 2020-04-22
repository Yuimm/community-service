package com.hct.comm.coupon.service;

import com.hct.comm.coupon.entity.SmsMemberPrice;
import java.util.List;

/**
 * 商品会员价格(SmsMemberPrice)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public interface SmsMemberPriceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsMemberPrice queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmsMemberPrice> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    SmsMemberPrice insert(SmsMemberPrice smsMemberPrice);

    /**
     * 修改数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    SmsMemberPrice update(SmsMemberPrice smsMemberPrice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}