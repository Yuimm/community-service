package com.hct.comm.order.service.impl;

import com.hct.comm.order.entity.OmsOrderReturnApply;
import com.hct.comm.order.dao.OmsOrderReturnApplyDao;
import com.hct.comm.order.service.OmsOrderReturnApplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单退货申请(OmsOrderReturnApply)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {
    @Resource
    private OmsOrderReturnApplyDao omsOrderReturnApplyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnApply queryById(Long id) {
        return this.omsOrderReturnApplyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OmsOrderReturnApply> queryAllByLimit(int offset, int limit) {
        return this.omsOrderReturnApplyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnApply insert(OmsOrderReturnApply omsOrderReturnApply) {
        this.omsOrderReturnApplyDao.insert(omsOrderReturnApply);
        return omsOrderReturnApply;
    }

    /**
     * 修改数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnApply update(OmsOrderReturnApply omsOrderReturnApply) {
        this.omsOrderReturnApplyDao.update(omsOrderReturnApply);
        return this.queryById(omsOrderReturnApply.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderReturnApplyDao.deleteById(id) > 0;
    }
}