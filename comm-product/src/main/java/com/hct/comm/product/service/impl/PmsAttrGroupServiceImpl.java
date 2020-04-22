package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsAttrGroup;
import com.hct.comm.product.dao.PmsAttrGroupDao;
import com.hct.comm.product.service.PmsAttrGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 属性分组(PmsAttrGroup)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@Service("pmsAttrGroupService")
public class PmsAttrGroupServiceImpl implements PmsAttrGroupService {
    @Resource
    private PmsAttrGroupDao pmsAttrGroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param attrGroupId 主键
     * @return 实例对象
     */
    @Override
    public PmsAttrGroup queryById(Long attrGroupId) {
        return this.pmsAttrGroupDao.queryById(attrGroupId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsAttrGroup> queryAllByLimit(int offset, int limit) {
        return this.pmsAttrGroupDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrGroup insert(PmsAttrGroup pmsAttrGroup) {
        this.pmsAttrGroupDao.insert(pmsAttrGroup);
        return pmsAttrGroup;
    }

    /**
     * 修改数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrGroup update(PmsAttrGroup pmsAttrGroup) {
        this.pmsAttrGroupDao.update(pmsAttrGroup);
        return this.queryById(pmsAttrGroup.getAttrGroupId());
    }

    /**
     * 通过主键删除数据
     *
     * @param attrGroupId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long attrGroupId) {
        return this.pmsAttrGroupDao.deleteById(attrGroupId) > 0;
    }
}