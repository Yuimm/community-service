package com.hct.comm.member.service.impl;

import com.hct.comm.member.entity.UmsMemberLoginLog;
import com.hct.comm.member.dao.UmsMemberLoginLogDao;
import com.hct.comm.member.service.UmsMemberLoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员登录记录(UmsMemberLoginLog)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService {
    @Resource
    private UmsMemberLoginLogDao umsMemberLoginLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberLoginLog queryById(Long id) {
        return this.umsMemberLoginLogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsMemberLoginLog> queryAllByLimit(int offset, int limit) {
        return this.umsMemberLoginLogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsMemberLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLoginLog insert(UmsMemberLoginLog umsMemberLoginLog) {
        this.umsMemberLoginLogDao.insert(umsMemberLoginLog);
        return umsMemberLoginLog;
    }

    /**
     * 修改数据
     *
     * @param umsMemberLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLoginLog update(UmsMemberLoginLog umsMemberLoginLog) {
        this.umsMemberLoginLogDao.update(umsMemberLoginLog);
        return this.queryById(umsMemberLoginLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberLoginLogDao.deleteById(id) > 0;
    }
}