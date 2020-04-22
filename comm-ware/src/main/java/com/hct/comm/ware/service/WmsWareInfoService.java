package com.hct.comm.ware.service;

import com.hct.comm.ware.entity.WmsWareInfo;
import java.util.List;

/**
 * 仓库信息(WmsWareInfo)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 13:03:45
 */
public interface WmsWareInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareInfo queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WmsWareInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    WmsWareInfo insert(WmsWareInfo wmsWareInfo);

    /**
     * 修改数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    WmsWareInfo update(WmsWareInfo wmsWareInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}