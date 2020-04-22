package com.hct.comm.order.service.impl;

import com.hct.comm.order.entity.OmsPaymentInfo;
import com.hct.comm.order.dao.OmsPaymentInfoDao;
import com.hct.comm.order.service.OmsPaymentInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 支付信息表(OmsPaymentInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl implements OmsPaymentInfoService {
    @Resource
    private OmsPaymentInfoDao omsPaymentInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsPaymentInfo queryById(Long id) {
        return this.omsPaymentInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OmsPaymentInfo> queryAllByLimit(int offset, int limit) {
        return this.omsPaymentInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsPaymentInfo insert(OmsPaymentInfo omsPaymentInfo) {
        this.omsPaymentInfoDao.insert(omsPaymentInfo);
        return omsPaymentInfo;
    }

    /**
     * 修改数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsPaymentInfo update(OmsPaymentInfo omsPaymentInfo) {
        this.omsPaymentInfoDao.update(omsPaymentInfo);
        return this.queryById(omsPaymentInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsPaymentInfoDao.deleteById(id) > 0;
    }
}