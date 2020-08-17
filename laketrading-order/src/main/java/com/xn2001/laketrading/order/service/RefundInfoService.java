package com.xn2001.laketrading.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:38:37
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

