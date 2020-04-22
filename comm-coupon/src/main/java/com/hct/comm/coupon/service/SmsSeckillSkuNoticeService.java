package com.hct.comm.coupon.service;

import com.hct.comm.coupon.entity.SmsSeckillSkuNotice;
import java.util.List;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public interface SmsSeckillSkuNoticeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSeckillSkuNotice queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmsSeckillSkuNotice> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuNotice insert(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * 修改数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuNotice update(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}