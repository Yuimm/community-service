package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsSeckillSkuRelation;
import com.hct.comm.coupon.dao.SmsSeckillSkuRelationDao;
import com.hct.comm.coupon.service.SmsSeckillSkuRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:53
 */
@Service("smsSeckillSkuRelationService")
public class SmsSeckillSkuRelationServiceImpl implements SmsSeckillSkuRelationService {
    @Resource
    private SmsSeckillSkuRelationDao smsSeckillSkuRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuRelation queryById(Long id) {
        return this.smsSeckillSkuRelationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsSeckillSkuRelation> queryAllByLimit(int offset, int limit) {
        return this.smsSeckillSkuRelationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuRelation insert(SmsSeckillSkuRelation smsSeckillSkuRelation) {
        this.smsSeckillSkuRelationDao.insert(smsSeckillSkuRelation);
        return smsSeckillSkuRelation;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuRelation update(SmsSeckillSkuRelation smsSeckillSkuRelation) {
        this.smsSeckillSkuRelationDao.update(smsSeckillSkuRelation);
        return this.queryById(smsSeckillSkuRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillSkuRelationDao.deleteById(id) > 0;
    }
}