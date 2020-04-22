package com.hct.comm.product.service;

import com.hct.comm.product.entity.PmsSpuComment;
import java.util.List;

/**
 * 商品评价(PmsSpuComment)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
public interface PmsSpuCommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuComment queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PmsSpuComment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    PmsSpuComment insert(PmsSpuComment pmsSpuComment);

    /**
     * 修改数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    PmsSpuComment update(PmsSpuComment pmsSpuComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}