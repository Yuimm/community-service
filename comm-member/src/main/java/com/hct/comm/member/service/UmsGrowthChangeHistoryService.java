package com.hct.comm.member.service;

import com.hct.comm.member.entity.UmsGrowthChangeHistory;
import java.util.List;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:48:00
 */
public interface UmsGrowthChangeHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsGrowthChangeHistory queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsGrowthChangeHistory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    UmsGrowthChangeHistory insert(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * 修改数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    UmsGrowthChangeHistory update(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}