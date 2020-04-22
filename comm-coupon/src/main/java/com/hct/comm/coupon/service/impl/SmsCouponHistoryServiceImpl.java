package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsCouponHistory;
import com.hct.comm.coupon.dao.SmsCouponHistoryDao;
import com.hct.comm.coupon.service.SmsCouponHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {
    @Resource
    private SmsCouponHistoryDao smsCouponHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCouponHistory queryById(Long id) {
        return this.smsCouponHistoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsCouponHistory> queryAllByLimit(int offset, int limit) {
        return this.smsCouponHistoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsCouponHistory 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponHistory insert(SmsCouponHistory smsCouponHistory) {
        this.smsCouponHistoryDao.insert(smsCouponHistory);
        return smsCouponHistory;
    }

    /**
     * 修改数据
     *
     * @param smsCouponHistory 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponHistory update(SmsCouponHistory smsCouponHistory) {
        this.smsCouponHistoryDao.update(smsCouponHistory);
        return this.queryById(smsCouponHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponHistoryDao.deleteById(id) > 0;
    }
}