package com.hct.comm.member.service.impl;

import com.hct.comm.member.entity.UmsMemberStatisticsInfo;
import com.hct.comm.member.dao.UmsMemberStatisticsInfoDao;
import com.hct.comm.member.service.UmsMemberStatisticsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
@Service("umsMemberStatisticsInfoService")
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService {
    @Resource
    private UmsMemberStatisticsInfoDao umsMemberStatisticsInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberStatisticsInfo queryById(Long id) {
        return this.umsMemberStatisticsInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsMemberStatisticsInfo> queryAllByLimit(int offset, int limit) {
        return this.umsMemberStatisticsInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberStatisticsInfo insert(UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        this.umsMemberStatisticsInfoDao.insert(umsMemberStatisticsInfo);
        return umsMemberStatisticsInfo;
    }

    /**
     * 修改数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberStatisticsInfo update(UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        this.umsMemberStatisticsInfoDao.update(umsMemberStatisticsInfo);
        return this.queryById(umsMemberStatisticsInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberStatisticsInfoDao.deleteById(id) > 0;
    }
}