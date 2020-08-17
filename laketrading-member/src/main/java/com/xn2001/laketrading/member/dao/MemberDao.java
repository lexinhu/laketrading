package com.xn2001.laketrading.member.dao;

import com.xn2001.laketrading.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:34:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
