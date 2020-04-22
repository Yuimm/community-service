package com.hct.comm.member.service;

import com.hct.comm.member.entity.UmsIntegrationChangeHistory;
import java.util.List;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:48:17
 */
public interface UmsIntegrationChangeHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsIntegrationChangeHistory queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsIntegrationChangeHistory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    UmsIntegrationChangeHistory insert(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * 修改数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    UmsIntegrationChangeHistory update(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}