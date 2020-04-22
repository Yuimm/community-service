package com.hct.comm.member.service.impl;

import com.hct.comm.member.entity.UmsGrowthChangeHistory;
import com.hct.comm.member.dao.UmsGrowthChangeHistoryDao;
import com.hct.comm.member.service.UmsGrowthChangeHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:48:01
 */
@Service("umsGrowthChangeHistoryService")
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService {
    @Resource
    private UmsGrowthChangeHistoryDao umsGrowthChangeHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsGrowthChangeHistory queryById(Long id) {
        return this.umsGrowthChangeHistoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsGrowthChangeHistory> queryAllByLimit(int offset, int limit) {
        return this.umsGrowthChangeHistoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsGrowthChangeHistory insert(UmsGrowthChangeHistory umsGrowthChangeHistory) {
        this.umsGrowthChangeHistoryDao.insert(umsGrowthChangeHistory);
        return umsGrowthChangeHistory;
    }

    /**
     * 修改数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsGrowthChangeHistory update(UmsGrowthChangeHistory umsGrowthChangeHistory) {
        this.umsGrowthChangeHistoryDao.update(umsGrowthChangeHistory);
        return this.queryById(umsGrowthChangeHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsGrowthChangeHistoryDao.deleteById(id) > 0;
    }
}