package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsSpuImages;
import com.hct.comm.product.dao.PmsSpuImagesDao;
import com.hct.comm.product.service.PmsSpuImagesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * spu图片(PmsSpuImages)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@Service("pmsSpuImagesService")
public class PmsSpuImagesServiceImpl implements PmsSpuImagesService {
    @Resource
    private PmsSpuImagesDao pmsSpuImagesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSpuImages queryById(Long id) {
        return this.pmsSpuImagesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsSpuImages> queryAllByLimit(int offset, int limit) {
        return this.pmsSpuImagesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuImages insert(PmsSpuImages pmsSpuImages) {
        this.pmsSpuImagesDao.insert(pmsSpuImages);
        return pmsSpuImages;
    }

    /**
     * 修改数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuImages update(PmsSpuImages pmsSpuImages) {
        this.pmsSpuImagesDao.update(pmsSpuImages);
        return this.queryById(pmsSpuImages.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSpuImagesDao.deleteById(id) > 0;
    }
}