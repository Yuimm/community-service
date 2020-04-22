package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsAttrAttrgroupRelation;
import com.hct.comm.product.dao.PmsAttrAttrgroupRelationDao;
import com.hct.comm.product.service.PmsAttrAttrgroupRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@Service("pmsAttrAttrgroupRelationService")
public class PmsAttrAttrgroupRelationServiceImpl implements PmsAttrAttrgroupRelationService {
    @Resource
    private PmsAttrAttrgroupRelationDao pmsAttrAttrgroupRelationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsAttrAttrgroupRelation queryById(Long id) {
        return this.pmsAttrAttrgroupRelationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsAttrAttrgroupRelation> queryAllByLimit(int offset, int limit) {
        return this.pmsAttrAttrgroupRelationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrAttrgroupRelation insert(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        this.pmsAttrAttrgroupRelationDao.insert(pmsAttrAttrgroupRelation);
        return pmsAttrAttrgroupRelation;
    }

    /**
     * 修改数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrAttrgroupRelation update(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        this.pmsAttrAttrgroupRelationDao.update(pmsAttrAttrgroupRelation);
        return this.queryById(pmsAttrAttrgroupRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsAttrAttrgroupRelationDao.deleteById(id) > 0;
    }
}