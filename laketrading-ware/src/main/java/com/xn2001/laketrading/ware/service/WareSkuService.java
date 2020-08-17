package com.xn2001.laketrading.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:44:15
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

