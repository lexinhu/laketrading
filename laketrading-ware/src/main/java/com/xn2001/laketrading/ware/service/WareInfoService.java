package com.xn2001.laketrading.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.laketrading.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:44:15
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

