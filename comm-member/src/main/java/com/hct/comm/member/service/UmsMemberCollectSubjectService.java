package com.hct.comm.member.service;

import com.hct.comm.member.entity.UmsMemberCollectSubject;
import java.util.List;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
public interface UmsMemberCollectSubjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberCollectSubject queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsMemberCollectSubject> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    UmsMemberCollectSubject insert(UmsMemberCollectSubject umsMemberCollectSubject);

    /**
     * 修改数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    UmsMemberCollectSubject update(UmsMemberCollectSubject umsMemberCollectSubject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}