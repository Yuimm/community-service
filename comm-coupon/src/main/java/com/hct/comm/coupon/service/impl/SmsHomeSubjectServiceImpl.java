package com.hct.comm.coupon.service.impl;

import com.hct.comm.coupon.entity.SmsHomeSubject;
import com.hct.comm.coupon.dao.SmsHomeSubjectDao;
import com.hct.comm.coupon.service.SmsHomeSubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
@Service("smsHomeSubjectService")
public class SmsHomeSubjectServiceImpl implements SmsHomeSubjectService {
    @Resource
    private SmsHomeSubjectDao smsHomeSubjectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsHomeSubject queryById(Long id) {
        return this.smsHomeSubjectDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SmsHomeSubject> queryAllByLimit(int offset, int limit) {
        return this.smsHomeSubjectDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubject insert(SmsHomeSubject smsHomeSubject) {
        this.smsHomeSubjectDao.insert(smsHomeSubject);
        return smsHomeSubject;
    }

    /**
     * 修改数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubject update(SmsHomeSubject smsHomeSubject) {
        this.smsHomeSubjectDao.update(smsHomeSubject);
        return this.queryById(smsHomeSubject.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsHomeSubjectDao.deleteById(id) > 0;
    }
}