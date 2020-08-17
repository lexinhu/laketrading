package com.xn2001.laketrading.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-15 23:21:24
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

