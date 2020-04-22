package com.hct.comm.ware.service;

import com.hct.comm.ware.entity.WmsWareOrderTaskDetail;
import java.util.List;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 13:03:47
 */
public interface WmsWareOrderTaskDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareOrderTaskDetail queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WmsWareOrderTaskDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    WmsWareOrderTaskDetail insert(WmsWareOrderTaskDetail wmsWareOrderTaskDetail);

    /**
     * 修改数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    WmsWareOrderTaskDetail update(WmsWareOrderTaskDetail wmsWareOrderTaskDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}