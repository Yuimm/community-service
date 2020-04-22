package com.hct.comm.order.service.impl;

import com.hct.comm.order.entity.OmsRefundInfo;
import com.hct.comm.order.dao.OmsRefundInfoDao;
import com.hct.comm.order.service.OmsRefundInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 退款信息(OmsRefundInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@Service("omsRefundInfoService")
public class OmsRefundInfoServiceImpl implements OmsRefundInfoService {
    @Resource
    private OmsRefundInfoDao omsRefundInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsRefundInfo queryById(Long id) {
        return this.omsRefundInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OmsRefundInfo> queryAllByLimit(int offset, int limit) {
        return this.omsRefundInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsRefundInfo insert(OmsRefundInfo omsRefundInfo) {
        this.omsRefundInfoDao.insert(omsRefundInfo);
        return omsRefundInfo;
    }

    /**
     * 修改数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsRefundInfo update(OmsRefundInfo omsRefundInfo) {
        this.omsRefundInfoDao.update(omsRefundInfo);
        return this.queryById(omsRefundInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsRefundInfoDao.deleteById(id) > 0;
    }
}