package com.xn2001.laketrading.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-15 23:21:24
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

