package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsSeckillPromotion;
import com.hct.comm.coupon.dao.SmsSeckillPromotionDao;
import com.hct.comm.coupon.service.SmsSeckillPromotionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 秒杀活动(SmsSeckillPromotion)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@Service("smsSeckillPromotionService")
public class SmsSeckillPromotionServiceImpl implements SmsSeckillPromotionService {
    @Resource
    private SmsSeckillPromotionDao smsSeckillPromotionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillPromotion queryById(Long id) {
        return this.smsSeckillPromotionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsSeckillPromotion> queryAllByLimit(int offset, int limit) {
        return this.smsSeckillPromotionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillPromotion 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillPromotion insert(SmsSeckillPromotion smsSeckillPromotion) {
        this.smsSeckillPromotionDao.insert(smsSeckillPromotion);
        return smsSeckillPromotion;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillPromotion 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillPromotion update(SmsSeckillPromotion smsSeckillPromotion) {
        this.smsSeckillPromotionDao.update(smsSeckillPromotion);
        return this.queryById(smsSeckillPromotion.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillPromotionDao.deleteById(id) > 0;
    }
}