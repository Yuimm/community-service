package com.hct.comm.product.service;

import com.hct.comm.product.entity.PmsCommentReplay;
import java.util.List;

/**
 * 商品评价回复关系(PmsCommentReplay)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsCommentReplayService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsCommentReplay queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsCommentReplay> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    PmsCommentReplay insert(PmsCommentReplay pmsCommentReplay);

    /**
     * 修改数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    PmsCommentReplay update(PmsCommentReplay pmsCommentReplay);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}