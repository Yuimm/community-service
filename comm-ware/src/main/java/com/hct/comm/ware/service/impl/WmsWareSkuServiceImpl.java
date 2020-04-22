package com.hct.comm.ware.service.impl;

import com.hct.comm.ware.entity.WmsWareSku;
import com.hct.comm.ware.dao.WmsWareSkuDao;
import com.hct.comm.ware.service.WmsWareSkuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品库存(WmsWareSku)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 13:03:47
 */
@Service("wmsWareSkuService")
public class WmsWareSkuServiceImpl implements WmsWareSkuService {
    @Resource
    private WmsWareSkuDao wmsWareSkuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareSku queryById(Long id) {
        return this.wmsWareSkuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WmsWareSku> queryAllByLimit(int offset, int limit) {
        return this.wmsWareSkuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wmsWareSku 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareSku insert(WmsWareSku wmsWareSku) {
        this.wmsWareSkuDao.insert(wmsWareSku);
        return wmsWareSku;
    }

    /**
     * 修改数据
     *
     * @param wmsWareSku 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareSku update(WmsWareSku wmsWareSku) {
        this.wmsWareSkuDao.update(wmsWareSku);
        return this.queryById(wmsWareSku.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareSkuDao.deleteById(id) > 0;
    }
}