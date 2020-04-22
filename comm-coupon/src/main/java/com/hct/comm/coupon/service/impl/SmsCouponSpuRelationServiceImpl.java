package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsCouponSpuRelation;
import com.hct.comm.coupon.dao.SmsCouponSpuRelationDao;
import com.hct.comm.coupon.service.SmsCouponSpuRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl implements SmsCouponSpuRelationService {
    @Resource
    private SmsCouponSpuRelationDao smsCouponSpuRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuRelation queryById(Long id) {
        return this.smsCouponSpuRelationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsCouponSpuRelation> queryAllByLimit(int offset, int limit) {
        return this.smsCouponSpuRelationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuRelation insert(SmsCouponSpuRelation smsCouponSpuRelation) {
        this.smsCouponSpuRelationDao.insert(smsCouponSpuRelation);
        return smsCouponSpuRelation;
    }

    /**
     * 修改数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuRelation update(SmsCouponSpuRelation smsCouponSpuRelation) {
        this.smsCouponSpuRelationDao.update(smsCouponSpuRelation);
        return this.queryById(smsCouponSpuRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponSpuRelationDao.deleteById(id) > 0;
    }
}