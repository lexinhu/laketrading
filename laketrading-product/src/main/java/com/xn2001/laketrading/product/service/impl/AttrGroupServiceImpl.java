package com.xn2001.laketrading.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.common.utils.Query;
import com.xn2001.laketrading.product.dao.AttrGroupDao;
import com.xn2001.laketrading.product.entity.AttrEntity;
import com.xn2001.laketrading.product.entity.AttrGroupEntity;
import com.xn2001.laketrading.product.service.AttrGroupService;
import com.xn2001.laketrading.product.service.AttrService;
import com.xn2001.laketrading.product.vo.AttrGroupWithAttrsVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Autowired
    private AttrService attrService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<>()
        );
        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogyId) {
        // 人人这里的数据封装垃圾的一批, 凑合用吧, 看了十几分钟才看明白他这个东西怎么用.
        String key = (String) params.get("key");
        QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(key)) {
            wrapper.and((w) -> {
                w.eq("attr_group_id", key).or().like("attr_group_name", key);
            });
        }
        if (catelogyId != 0) {
            wrapper.eq("catelog_id", catelogyId);
        }
        IPage<AttrGroupEntity> page = this.page(new Query<AttrGroupEntity>().getPage(params), wrapper);
        return new PageUtils(page);
    }

    /**
     * 根据分类id查出所有的分组以及这些组里面的属性
     */
    @Override
    public List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId) {
        // 查询所有属性分组信息
        List<AttrGroupEntity> attrGroupEntities = this.list(new QueryWrapper<AttrGroupEntity>()
                .lambda().eq(AttrGroupEntity::getCatelogId,catelogId));
        // 查询属性分组中的所有属性
        List<AttrGroupWithAttrsVo> collect = attrGroupEntities.stream().map(item -> {
            AttrGroupWithAttrsVo groupWithAttrsVo = new AttrGroupWithAttrsVo();
            BeanUtils.copyProperties(item, groupWithAttrsVo);
            List<AttrEntity> relationAttr = attrService.getRelationAttr(groupWithAttrsVo.getAttrGroupId());
            groupWithAttrsVo.setAttrs(relationAttr);
            return groupWithAttrsVo;
        }).collect(Collectors.toList());
        return collect;
    }
}