package com.xn2001.laketrading.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:34:02
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

