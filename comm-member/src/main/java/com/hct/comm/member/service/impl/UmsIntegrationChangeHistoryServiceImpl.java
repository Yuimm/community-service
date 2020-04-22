package com.hct.comm.member.service.impl;

import com.hct.comm.member.entity.UmsIntegrationChangeHistory;
import com.hct.comm.member.dao.UmsIntegrationChangeHistoryDao;
import com.hct.comm.member.service.UmsIntegrationChangeHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:48:18
 */
@Service("umsIntegrationChangeHistoryService")
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService {
    @Resource
    private UmsIntegrationChangeHistoryDao umsIntegrationChangeHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsIntegrationChangeHistory queryById(Long id) {
        return this.umsIntegrationChangeHistoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsIntegrationChangeHistory> queryAllByLimit(int offset, int limit) {
        return this.umsIntegrationChangeHistoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsIntegrationChangeHistory insert(UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        this.umsIntegrationChangeHistoryDao.insert(umsIntegrationChangeHistory);
        return umsIntegrationChangeHistory;
    }

    /**
     * 修改数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsIntegrationChangeHistory update(UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        this.umsIntegrationChangeHistoryDao.update(umsIntegrationChangeHistory);
        return this.queryById(umsIntegrationChangeHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsIntegrationChangeHistoryDao.deleteById(id) > 0;
    }
}