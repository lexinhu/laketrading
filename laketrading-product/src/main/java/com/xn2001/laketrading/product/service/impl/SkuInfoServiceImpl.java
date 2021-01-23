package com.xn2001.laketrading.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.common.utils.Query;
import com.xn2001.laketrading.product.dao.SkuInfoDao;
import com.xn2001.laketrading.product.entity.SkuInfoEntity;
import com.xn2001.laketrading.product.service.SkuInfoService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPageByCondition(Map<String, Object> params) {

        QueryWrapper<SkuInfoEntity> wrapper = new QueryWrapper<>();
        String key = (String) params.get("key");
        if (!StringUtils.isEmpty(key)) {
            wrapper.and(w -> {
                w.lambda().eq(SkuInfoEntity::getSkuId, key).or().like(SkuInfoEntity::getSkuName, key);
            });
        }

        String brandId = (String) params.get("brandId");
        if (!StringUtils.isEmpty(brandId) && !"0".equals(brandId)) {
            wrapper.lambda().eq(SkuInfoEntity::getBrandId, brandId);
        }

        String catelogId = (String) params.get("catelog_id");
        if (!StringUtils.isEmpty(catelogId) && !"0".equals(catelogId)) {
            wrapper.lambda().eq(SkuInfoEntity::getCatalogId, catelogId);
        }

        String min = (String) params.get("min");
        if (StringUtils.isNumeric(min) && BigDecimal.ZERO.compareTo(new BigDecimal(min)) < 0) {
            wrapper.lambda().ge(SkuInfoEntity::getPrice, min);
            //wrapper.ge("price",min);
        }
        String max = (String) params.get("max");
        if (StringUtils.isNumeric(max) && BigDecimal.ZERO.compareTo(new BigDecimal(max)) < 0) {
            wrapper.lambda().le(SkuInfoEntity::getPrice, max);
            //wrapper.le("price",max);
        }

        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                wrapper
        );
        return new PageUtils(page);
    }

}