package com.hct.comm.order.service.impl;

import com.hct.comm.order.entity.OmsOrderSetting;
import com.hct.comm.order.dao.OmsOrderSettingDao;
import com.hct.comm.order.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单配置信息(OmsOrderSetting)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:59:04
 */
@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    @Resource
    private OmsOrderSettingDao omsOrderSettingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderSetting queryById(Long id) {
        return this.omsOrderSettingDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OmsOrderSetting> queryAllByLimit(int offset, int limit) {
        return this.omsOrderSettingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderSetting insert(OmsOrderSetting omsOrderSetting) {
        this.omsOrderSettingDao.insert(omsOrderSetting);
        return omsOrderSetting;
    }

    /**
     * 修改数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderSetting update(OmsOrderSetting omsOrderSetting) {
        this.omsOrderSettingDao.update(omsOrderSetting);
        return this.queryById(omsOrderSetting.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderSettingDao.deleteById(id) > 0;
    }
}