package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsProductAttrValue;
import com.hct.comm.product.dao.PmsProductAttrValueDao;
import com.hct.comm.product.service.PmsProductAttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * spu属性值(PmsProductAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@Service("pmsProductAttrValueService")
public class PmsProductAttrValueServiceImpl implements PmsProductAttrValueService {
    @Resource
    private PmsProductAttrValueDao pmsProductAttrValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductAttrValue queryById(Long id) {
        return this.pmsProductAttrValueDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsProductAttrValue> queryAllByLimit(int offset, int limit) {
        return this.pmsProductAttrValueDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttrValue insert(PmsProductAttrValue pmsProductAttrValue) {
        this.pmsProductAttrValueDao.insert(pmsProductAttrValue);
        return pmsProductAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttrValue update(PmsProductAttrValue pmsProductAttrValue) {
        this.pmsProductAttrValueDao.update(pmsProductAttrValue);
        return this.queryById(pmsProductAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductAttrValueDao.deleteById(id) > 0;
    }
}