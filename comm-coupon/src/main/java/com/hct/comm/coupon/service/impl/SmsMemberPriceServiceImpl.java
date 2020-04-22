package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsMemberPrice;
import com.hct.comm.coupon.dao.SmsMemberPriceDao;
import com.hct.comm.coupon.service.SmsMemberPriceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品会员价格(SmsMemberPrice)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl implements SmsMemberPriceService {
    @Resource
    private SmsMemberPriceDao smsMemberPriceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsMemberPrice queryById(Long id) {
        return this.smsMemberPriceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsMemberPrice> queryAllByLimit(int offset, int limit) {
        return this.smsMemberPriceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsMemberPrice insert(SmsMemberPrice smsMemberPrice) {
        this.smsMemberPriceDao.insert(smsMemberPrice);
        return smsMemberPrice;
    }

    /**
     * 修改数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsMemberPrice update(SmsMemberPrice smsMemberPrice) {
        this.smsMemberPriceDao.update(smsMemberPrice);
        return this.queryById(smsMemberPrice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsMemberPriceDao.deleteById(id) > 0;
    }
}