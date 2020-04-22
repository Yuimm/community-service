package com.hct.comm.order.service.impl;

import com.hct.comm.order.entity.OmsOrderOperateHistory;
import com.hct.comm.order.dao.OmsOrderOperateHistoryDao;
import com.hct.comm.order.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService {
    @Resource
    private OmsOrderOperateHistoryDao omsOrderOperateHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderOperateHistory queryById(Long id) {
        return this.omsOrderOperateHistoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OmsOrderOperateHistory> queryAllByLimit(int offset, int limit) {
        return this.omsOrderOperateHistoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderOperateHistory insert(OmsOrderOperateHistory omsOrderOperateHistory) {
        this.omsOrderOperateHistoryDao.insert(omsOrderOperateHistory);
        return omsOrderOperateHistory;
    }

    /**
     * 修改数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderOperateHistory update(OmsOrderOperateHistory omsOrderOperateHistory) {
        this.omsOrderOperateHistoryDao.update(omsOrderOperateHistory);
        return this.queryById(omsOrderOperateHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderOperateHistoryDao.deleteById(id) > 0;
    }
}