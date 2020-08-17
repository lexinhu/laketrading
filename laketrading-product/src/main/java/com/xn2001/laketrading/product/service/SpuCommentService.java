package com.xn2001.laketrading.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-15 23:21:24
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

