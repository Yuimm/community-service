package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsSkuFullReduction;
import com.hct.comm.coupon.dao.SmsSkuFullReductionDao;
import com.hct.comm.coupon.service.SmsSkuFullReductionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品满减信息(SmsSkuFullReduction)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:53
 */
@Service("smsSkuFullReductionService")
public class SmsSkuFullReductionServiceImpl implements SmsSkuFullReductionService {
    @Resource
    private SmsSkuFullReductionDao smsSkuFullReductionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSkuFullReduction queryById(Long id) {
        return this.smsSkuFullReductionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsSkuFullReduction> queryAllByLimit(int offset, int limit) {
        return this.smsSkuFullReductionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuFullReduction insert(SmsSkuFullReduction smsSkuFullReduction) {
        this.smsSkuFullReductionDao.insert(smsSkuFullReduction);
        return smsSkuFullReduction;
    }

    /**
     * 修改数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuFullReduction update(SmsSkuFullReduction smsSkuFullReduction) {
        this.smsSkuFullReductionDao.update(smsSkuFullReduction);
        return this.queryById(smsSkuFullReduction.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSkuFullReductionDao.deleteById(id) > 0;
    }
}