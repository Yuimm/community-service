package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsAttr;
import com.hct.comm.product.dao.PmsAttrDao;
import com.hct.comm.product.service.PmsAttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品属性(PmsAttr)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:30
 */
@Service("pmsAttrService")
public class PmsAttrServiceImpl implements PmsAttrService {
    @Resource
    private PmsAttrDao pmsAttrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    @Override
    public PmsAttr queryById(Long attrId) {
        return this.pmsAttrDao.queryById(attrId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsAttr> queryAllByLimit(int offset, int limit) {
        return this.pmsAttrDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttr insert(PmsAttr pmsAttr) {
        this.pmsAttrDao.insert(pmsAttr);
        return pmsAttr;
    }

    /**
     * 修改数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttr update(PmsAttr pmsAttr) {
        this.pmsAttrDao.update(pmsAttr);
        return this.queryById(pmsAttr.getAttrId());
    }

    /**
     * 通过主键删除数据
     *
     * @param attrId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long attrId) {
        return this.pmsAttrDao.deleteById(attrId) > 0;
    }
}