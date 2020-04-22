package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsSkuInfo;
import com.hct.comm.product.dao.PmsSkuInfoDao;
import com.hct.comm.product.service.PmsSkuInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * sku信息(PmsSkuInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@Service("pmsSkuInfoService")
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService {
    @Resource
    private PmsSkuInfoDao pmsSkuInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo queryById(Long skuId) {
        return this.pmsSkuInfoDao.queryById(skuId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsSkuInfo> queryAllByLimit(int offset, int limit) {
        return this.pmsSkuInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo insert(PmsSkuInfo pmsSkuInfo) {
        this.pmsSkuInfoDao.insert(pmsSkuInfo);
        return pmsSkuInfo;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo update(PmsSkuInfo pmsSkuInfo) {
        this.pmsSkuInfoDao.update(pmsSkuInfo);
        return this.queryById(pmsSkuInfo.getSkuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long skuId) {
        return this.pmsSkuInfoDao.deleteById(skuId) > 0;
    }
}