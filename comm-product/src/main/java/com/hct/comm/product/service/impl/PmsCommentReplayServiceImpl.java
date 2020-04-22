package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsCommentReplay;
import com.hct.comm.product.dao.PmsCommentReplayDao;
import com.hct.comm.product.service.PmsCommentReplayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品评价回复关系(PmsCommentReplay)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@Service("pmsCommentReplayService")
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService {
    @Resource
    private PmsCommentReplayDao pmsCommentReplayDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsCommentReplay queryById(Long id) {
        return this.pmsCommentReplayDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsCommentReplay> queryAllByLimit(int offset, int limit) {
        return this.pmsCommentReplayDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCommentReplay insert(PmsCommentReplay pmsCommentReplay) {
        this.pmsCommentReplayDao.insert(pmsCommentReplay);
        return pmsCommentReplay;
    }

    /**
     * 修改数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCommentReplay update(PmsCommentReplay pmsCommentReplay) {
        this.pmsCommentReplayDao.update(pmsCommentReplay);
        return this.queryById(pmsCommentReplay.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsCommentReplayDao.deleteById(id) > 0;
    }
}