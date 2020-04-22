package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsHomeAdv;
import com.hct.comm.coupon.dao.SmsHomeAdvDao;
import com.hct.comm.coupon.service.SmsHomeAdvService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 首页轮播广告(SmsHomeAdv)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl implements SmsHomeAdvService {
    @Resource
    private SmsHomeAdvDao smsHomeAdvDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsHomeAdv queryById(Long id) {
        return this.smsHomeAdvDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsHomeAdv> queryAllByLimit(int offset, int limit) {
        return this.smsHomeAdvDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsHomeAdv 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeAdv insert(SmsHomeAdv smsHomeAdv) {
        this.smsHomeAdvDao.insert(smsHomeAdv);
        return smsHomeAdv;
    }

    /**
     * 修改数据
     *
     * @param smsHomeAdv 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeAdv update(SmsHomeAdv smsHomeAdv) {
        this.smsHomeAdvDao.update(smsHomeAdv);
        return this.queryById(smsHomeAdv.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsHomeAdvDao.deleteById(id) > 0;
    }
}