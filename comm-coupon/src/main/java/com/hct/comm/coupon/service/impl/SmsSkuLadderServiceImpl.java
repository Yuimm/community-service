package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsSkuLadder;
import com.hct.comm.coupon.dao.SmsSkuLadderDao;
import com.hct.comm.coupon.service.SmsSkuLadderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品阶梯价格(SmsSkuLadder)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:53
 */
@Service("smsSkuLadderService")
public class SmsSkuLadderServiceImpl implements SmsSkuLadderService {
    @Resource
    private SmsSkuLadderDao smsSkuLadderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSkuLadder queryById(Long id) {
        return this.smsSkuLadderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsSkuLadder> queryAllByLimit(int offset, int limit) {
        return this.smsSkuLadderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsSkuLadder 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuLadder insert(SmsSkuLadder smsSkuLadder) {
        this.smsSkuLadderDao.insert(smsSkuLadder);
        return smsSkuLadder;
    }

    /**
     * 修改数据
     *
     * @param smsSkuLadder 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuLadder update(SmsSkuLadder smsSkuLadder) {
        this.smsSkuLadderDao.update(smsSkuLadder);
        return this.queryById(smsSkuLadder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSkuLadderDao.deleteById(id) > 0;
    }
}