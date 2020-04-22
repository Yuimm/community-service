package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsHomeSubjectSpu;
import com.hct.comm.coupon.dao.SmsHomeSubjectSpuDao;
import com.hct.comm.coupon.service.SmsHomeSubjectSpuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 专题商品(SmsHomeSubjectSpu)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@Service("smsHomeSubjectSpuService")
public class SmsHomeSubjectSpuServiceImpl implements SmsHomeSubjectSpuService {
    @Resource
    private SmsHomeSubjectSpuDao smsHomeSubjectSpuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsHomeSubjectSpu queryById(Long id) {
        return this.smsHomeSubjectSpuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsHomeSubjectSpu> queryAllByLimit(int offset, int limit) {
        return this.smsHomeSubjectSpuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubjectSpu insert(SmsHomeSubjectSpu smsHomeSubjectSpu) {
        this.smsHomeSubjectSpuDao.insert(smsHomeSubjectSpu);
        return smsHomeSubjectSpu;
    }

    /**
     * 修改数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubjectSpu update(SmsHomeSubjectSpu smsHomeSubjectSpu) {
        this.smsHomeSubjectSpuDao.update(smsHomeSubjectSpu);
        return this.queryById(smsHomeSubjectSpu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsHomeSubjectSpuDao.deleteById(id) > 0;
    }
}