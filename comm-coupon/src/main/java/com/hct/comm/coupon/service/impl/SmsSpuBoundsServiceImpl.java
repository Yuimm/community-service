package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsSpuBounds;
import com.hct.comm.coupon.dao.SmsSpuBoundsDao;
import com.hct.comm.coupon.service.SmsSpuBoundsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品spu积分设置(SmsSpuBounds)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:53
 */
@Service("smsSpuBoundsService")
public class SmsSpuBoundsServiceImpl implements SmsSpuBoundsService {
    @Resource
    private SmsSpuBoundsDao smsSpuBoundsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSpuBounds queryById(Long id) {
        return this.smsSpuBoundsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsSpuBounds> queryAllByLimit(int offset, int limit) {
        return this.smsSpuBoundsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsSpuBounds 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSpuBounds insert(SmsSpuBounds smsSpuBounds) {
        this.smsSpuBoundsDao.insert(smsSpuBounds);
        return smsSpuBounds;
    }

    /**
     * 修改数据
     *
     * @param smsSpuBounds 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSpuBounds update(SmsSpuBounds smsSpuBounds) {
        this.smsSpuBoundsDao.update(smsSpuBounds);
        return this.queryById(smsSpuBounds.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSpuBoundsDao.deleteById(id) > 0;
    }
}