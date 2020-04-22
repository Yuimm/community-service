package com.hct.comm.ware.service.impl;

import com.hct.comm.ware.entity.WmsWareOrderTaskDetail;
import com.hct.comm.ware.dao.WmsWareOrderTaskDetailDao;
import com.hct.comm.ware.service.WmsWareOrderTaskDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 13:03:47
 */
@Service("wmsWareOrderTaskDetailService")
public class WmsWareOrderTaskDetailServiceImpl implements WmsWareOrderTaskDetailService {
    @Resource
    private WmsWareOrderTaskDetailDao wmsWareOrderTaskDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTaskDetail queryById(Long id) {
        return this.wmsWareOrderTaskDetailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WmsWareOrderTaskDetail> queryAllByLimit(int offset, int limit) {
        return this.wmsWareOrderTaskDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTaskDetail insert(WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        this.wmsWareOrderTaskDetailDao.insert(wmsWareOrderTaskDetail);
        return wmsWareOrderTaskDetail;
    }

    /**
     * 修改数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTaskDetail update(WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        this.wmsWareOrderTaskDetailDao.update(wmsWareOrderTaskDetail);
        return this.queryById(wmsWareOrderTaskDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareOrderTaskDetailDao.deleteById(id) > 0;
    }
}