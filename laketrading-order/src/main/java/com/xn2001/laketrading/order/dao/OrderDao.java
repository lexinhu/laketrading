package com.xn2001.laketrading.order.dao;

import com.xn2001.laketrading.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:38:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
