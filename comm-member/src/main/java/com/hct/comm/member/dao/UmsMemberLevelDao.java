package com.hct.comm.member.dao;

import com.hct.comm.member.entity.UmsMemberLevel;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 会员等级(UmsMemberLevel)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:53:49
 */
public interface UmsMemberLevelDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberLevel queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UmsMemberLevel> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param umsMemberLevel 实例对象
     * @return 对象列表
     */
    List<UmsMemberLevel> queryAll(UmsMemberLevel umsMemberLevel);

    /**
     * 新增数据
     *
     * @param umsMemberLevel 实例对象
     * @return 影响行数
     */
    int insert(UmsMemberLevel umsMemberLevel);

    /**
     * 修改数据
     *
     * @param umsMemberLevel 实例对象
     * @return 影响行数
     */
    int update(UmsMemberLevel umsMemberLevel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}