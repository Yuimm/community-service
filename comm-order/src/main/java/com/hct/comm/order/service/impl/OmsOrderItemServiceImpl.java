package com.hct.comm.order.service.impl;

import com.hct.comm.order.entity.OmsOrderItem;
import com.hct.comm.order.dao.OmsOrderItemDao;
import com.hct.comm.order.service.OmsOrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单项信息(OmsOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl implements OmsOrderItemService {
    @Resource
    private OmsOrderItemDao omsOrderItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderItem queryById(Long id) {
        return this.omsOrderItemDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OmsOrderItem> queryAllByLimit(int offset, int limit) {
        return this.omsOrderItemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderItem insert(OmsOrderItem omsOrderItem) {
        this.omsOrderItemDao.insert(omsOrderItem);
        return omsOrderItem;
    }

    /**
     * 修改数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderItem update(OmsOrderItem omsOrderItem) {
        this.omsOrderItemDao.update(omsOrderItem);
        return this.queryById(omsOrderItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderItemDao.deleteById(id) > 0;
    }
}