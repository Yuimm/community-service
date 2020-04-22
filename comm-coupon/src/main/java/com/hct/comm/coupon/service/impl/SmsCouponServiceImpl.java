package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsCoupon;
import com.hct.comm.coupon.dao.SmsCouponDao;
import com.hct.comm.coupon.service.SmsCouponService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 优惠券信息(SmsCoupon)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:49
 */
@Service("smsCouponService")
public class SmsCouponServiceImpl implements SmsCouponService {
    @Resource
    private SmsCouponDao smsCouponDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCoupon queryById(Long id) {
        return this.smsCouponDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsCoupon> queryAllByLimit(int offset, int limit) {
        return this.smsCouponDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsCoupon 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCoupon insert(SmsCoupon smsCoupon) {
        this.smsCouponDao.insert(smsCoupon);
        return smsCoupon;
    }

    /**
     * 修改数据
     *
     * @param smsCoupon 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCoupon update(SmsCoupon smsCoupon) {
        this.smsCouponDao.update(smsCoupon);
        return this.queryById(smsCoupon.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponDao.deleteById(id) > 0;
    }
}