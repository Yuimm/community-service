package com.hct.comm.member.service.impl;

import com.hct.comm.member.entity.UmsMemberCollectSubject;
import com.hct.comm.member.dao.UmsMemberCollectSubjectDao;
import com.hct.comm.member.service.UmsMemberCollectSubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
@Service("umsMemberCollectSubjectService")
public class UmsMemberCollectSubjectServiceImpl implements UmsMemberCollectSubjectService {
    @Resource
    private UmsMemberCollectSubjectDao umsMemberCollectSubjectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSubject queryById(Long id) {
        return this.umsMemberCollectSubjectDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsMemberCollectSubject> queryAllByLimit(int offset, int limit) {
        return this.umsMemberCollectSubjectDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSubject insert(UmsMemberCollectSubject umsMemberCollectSubject) {
        this.umsMemberCollectSubjectDao.insert(umsMemberCollectSubject);
        return umsMemberCollectSubject;
    }

    /**
     * 修改数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSubject update(UmsMemberCollectSubject umsMemberCollectSubject) {
        this.umsMemberCollectSubjectDao.update(umsMemberCollectSubject);
        return this.queryById(umsMemberCollectSubject.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberCollectSubjectDao.deleteById(id) > 0;
    }
}