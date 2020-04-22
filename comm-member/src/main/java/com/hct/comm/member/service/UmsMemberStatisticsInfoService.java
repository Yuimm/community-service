package com.hct.comm.member.service;

import com.hct.comm.member.entity.UmsMemberStatisticsInfo;
import java.util.List;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
public interface UmsMemberStatisticsInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberStatisticsInfo queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsMemberStatisticsInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    UmsMemberStatisticsInfo insert(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

    /**
     * 修改数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    UmsMemberStatisticsInfo update(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}