package com.xn2001.laketrading.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:44:15
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

