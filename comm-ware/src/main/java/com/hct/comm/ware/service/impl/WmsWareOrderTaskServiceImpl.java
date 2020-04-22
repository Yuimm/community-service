package com.hct.comm.ware.service.impl;

import com.hct.comm.ware.entity.WmsWareOrderTask;
import com.hct.comm.ware.dao.WmsWareOrderTaskDao;
import com.hct.comm.ware.service.WmsWareOrderTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 库存工作单(WmsWareOrderTask)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 13:03:47
 */
@Service("wmsWareOrderTaskService")
public class WmsWareOrderTaskServiceImpl implements WmsWareOrderTaskService {
    @Resource
    private WmsWareOrderTaskDao wmsWareOrderTaskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTask queryById(Long id) {
        return this.wmsWareOrderTaskDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WmsWareOrderTask> queryAllByLimit(int offset, int limit) {
        return this.wmsWareOrderTaskDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTask insert(WmsWareOrderTask wmsWareOrderTask) {
        this.wmsWareOrderTaskDao.insert(wmsWareOrderTask);
        return wmsWareOrderTask;
    }

    /**
     * 修改数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTask update(WmsWareOrderTask wmsWareOrderTask) {
        this.wmsWareOrderTaskDao.update(wmsWareOrderTask);
        return this.queryById(wmsWareOrderTask.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareOrderTaskDao.deleteById(id) > 0;
    }
}