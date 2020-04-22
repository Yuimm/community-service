package com.hct.comm.product.service.impl;

import com.hct.comm.product.entity.PmsCategory;
import com.hct.comm.product.dao.PmsCategoryDao;
import com.hct.comm.product.service.PmsCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品三级分类(PmsCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 11:35:32
 */
@Service("pmsCategoryService")
public class PmsCategoryServiceImpl implements PmsCategoryService {
    @Resource
    private PmsCategoryDao pmsCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param catId 主键
     * @return 实例对象
     */
    @Override
    public PmsCategory queryById(Long catId) {
        return this.pmsCategoryDao.queryById(catId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PmsCategory> queryAllByLimit(int offset, int limit) {
        return this.pmsCategoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCategory insert(PmsCategory pmsCategory) {
        this.pmsCategoryDao.insert(pmsCategory);
        return pmsCategory;
    }

    /**
     * 修改数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCategory update(PmsCategory pmsCategory) {
        this.pmsCategoryDao.update(pmsCategory);
        return this.queryById(pmsCategory.getCatId());
    }

    /**
     * 通过主键删除数据
     *
     * @param catId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long catId) {
        return this.pmsCategoryDao.deleteById(catId) > 0;
    }

    //查出所有分类及子分类，以树状结构组装起来
    @Override
    public List<PmsCategory> listWithTree() {
        //1.查出所有的类
        List<PmsCategory> pmsCategories = pmsCategoryDao.queryAll(null);
        //2.组装成树形结构
            //2.1找出所有的一级分类
        List<PmsCategory> level_1 = pmsCategories.stream().filter(pmsCategory -> pmsCategory.getParentCid() == 0
        ).map((menu)->{
            menu.setChildren(getChilderns(menu,pmsCategories));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) -(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return level_1;
    }
    //递归查找所有菜单的子菜单
    private List<PmsCategory> getChilderns(PmsCategory root,List<PmsCategory> all){
        List<PmsCategory> children = all.stream().filter(pmsCategory -> {
            return pmsCategory.getParentCid() == root.getCatId();
        }).map(pmsCategory -> {
            //找到子菜单
            pmsCategory.setChildren(getChilderns(pmsCategory,all));
            return pmsCategory;
        }).sorted((menu1,menu2)->{
            //菜单的排序
            return (menu1.getSort()==null?0:menu1.getSort()) -(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }
}