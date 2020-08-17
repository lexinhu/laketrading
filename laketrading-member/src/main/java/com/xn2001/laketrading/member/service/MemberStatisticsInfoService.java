package com.xn2001.laketrading.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:34:02
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

