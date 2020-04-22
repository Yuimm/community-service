package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsCouponSpuCategoryRelation;
import com.hct.comm.coupon.dao.SmsCouponSpuCategoryRelationDao;
import com.hct.comm.coupon.service.SmsCouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl implements SmsCouponSpuCategoryRelationService {
    @Resource
    private SmsCouponSpuCategoryRelationDao smsCouponSpuCategoryRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuCategoryRelation queryById(Long id) {
        return this.smsCouponSpuCategoryRelationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsCouponSpuCategoryRelation> queryAllByLimit(int offset, int limit) {
        return this.smsCouponSpuCategoryRelationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsCouponSpuCategoryRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuCategoryRelation insert(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        this.smsCouponSpuCategoryRelationDao.insert(smsCouponSpuCategoryRelation);
        return smsCouponSpuCategoryRelation;
    }

    /**
     * 修改数据
     *
     * @param smsCouponSpuCategoryRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuCategoryRelation update(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        this.smsCouponSpuCategoryRelationDao.update(smsCouponSpuCategoryRelation);
        return this.queryById(smsCouponSpuCategoryRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponSpuCategoryRelationDao.deleteById(id) > 0;
    }
}