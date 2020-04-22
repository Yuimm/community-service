package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsSkuSaleAttrValue;
import com.hct.comm.product.dao.PmsSkuSaleAttrValueDao;
import com.hct.comm.product.service.PmsSkuSaleAttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@Service("pmsSkuSaleAttrValueService")
public class PmsSkuSaleAttrValueServiceImpl implements PmsSkuSaleAttrValueService {
    @Resource
    private PmsSkuSaleAttrValueDao pmsSkuSaleAttrValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue queryById(Long id) {
        return this.pmsSkuSaleAttrValueDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsSkuSaleAttrValue> queryAllByLimit(int offset, int limit) {
        return this.pmsSkuSaleAttrValueDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue insert(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        this.pmsSkuSaleAttrValueDao.insert(pmsSkuSaleAttrValue);
        return pmsSkuSaleAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue update(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        this.pmsSkuSaleAttrValueDao.update(pmsSkuSaleAttrValue);
        return this.queryById(pmsSkuSaleAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuSaleAttrValueDao.deleteById(id) > 0;
    }
}