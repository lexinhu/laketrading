package com.xn2001.laketrading.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:38:37
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

