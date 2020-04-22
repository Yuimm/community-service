package com.hct.comm.coupon.dao;

import com.hct.comm.coupon.entity.SmsCouponHistory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:23:51
 */
public interface SmsCouponHistoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsCouponHistory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SmsCouponHistory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param smsCouponHistory 实例对象
     * @return 对象列表
     */
    List<SmsCouponHistory> queryAll(SmsCouponHistory smsCouponHistory);

    /**
     * 新增数据
     *
     * @param smsCouponHistory 实例对象
     * @return 影响行数
     */
    int insert(SmsCouponHistory smsCouponHistory);

    /**
     * 修改数据
     *
     * @param smsCouponHistory 实例对象
     * @return 影响行数
     */
    int update(SmsCouponHistory smsCouponHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}