package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsSkuImages;
import com.hct.comm.product.dao.PmsSkuImagesDao;
import com.hct.comm.product.service.PmsSkuImagesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * sku图片(PmsSkuImages)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@Service("pmsSkuImagesService")
public class PmsSkuImagesServiceImpl implements PmsSkuImagesService {
    @Resource
    private PmsSkuImagesDao pmsSkuImagesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuImages queryById(Long id) {
        return this.pmsSkuImagesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsSkuImages> queryAllByLimit(int offset, int limit) {
        return this.pmsSkuImagesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuImages insert(PmsSkuImages pmsSkuImages) {
        this.pmsSkuImagesDao.insert(pmsSkuImages);
        return pmsSkuImages;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuImages update(PmsSkuImages pmsSkuImages) {
        this.pmsSkuImagesDao.update(pmsSkuImages);
        return this.queryById(pmsSkuImages.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuImagesDao.deleteById(id) > 0;
    }
}