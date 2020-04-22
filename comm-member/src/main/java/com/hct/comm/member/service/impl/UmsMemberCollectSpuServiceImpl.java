package com.hct.comm.member.service.impl;

import com.hct.comm.member.entity.UmsMemberCollectSpu;
import com.hct.comm.member.dao.UmsMemberCollectSpuDao;
import com.hct.comm.member.service.UmsMemberCollectSpuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:48:19
 */
@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl implements UmsMemberCollectSpuService {
    @Resource
    private UmsMemberCollectSpuDao umsMemberCollectSpuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSpu queryById(Long id) {
        return this.umsMemberCollectSpuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsMemberCollectSpu> queryAllByLimit(int offset, int limit) {
        return this.umsMemberCollectSpuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSpu insert(UmsMemberCollectSpu umsMemberCollectSpu) {
        this.umsMemberCollectSpuDao.insert(umsMemberCollectSpu);
        return umsMemberCollectSpu;
    }

    /**
     * 修改数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSpu update(UmsMemberCollectSpu umsMemberCollectSpu) {
        this.umsMemberCollectSpuDao.update(umsMemberCollectSpu);
        return this.queryById(umsMemberCollectSpu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberCollectSpuDao.deleteById(id) > 0;
    }
}