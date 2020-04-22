package com.hct.comm.coupon.dao;

import com.hct.comm.coupon.entity.SmsHomeSubject;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public interface SmsHomeSubjectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsHomeSubject queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmsHomeSubject> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param smsHomeSubject 实例对象
     * @return 对象列表
     */
    List<SmsHomeSubject> queryAll(SmsHomeSubject smsHomeSubject);

    /**
     * 新增数据
     *
     * @param smsHomeSubject 实例对象
     * @return 影响行数
     */
    int insert(SmsHomeSubject smsHomeSubject);

    /**
     * 修改数据
     *
     * @param smsHomeSubject 实例对象
     * @return 影响行数
     */
    int update(SmsHomeSubject smsHomeSubject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}