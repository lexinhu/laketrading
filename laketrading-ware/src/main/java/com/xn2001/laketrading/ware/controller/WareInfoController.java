package com.xn2001.laketrading.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xn2001.laketrading.ware.entity.WareInfoEntity;
import com.xn2001.laketrading.ware.service.WareInfoService;
import com.xn2001.common.utils.PageUtils;
import com.xn2001.common.utils.R;



/**
 * 仓库信息
 *
 * @author 乐心湖
 * @email zxh@xn2001.com
 * @date 2020-08-16 02:44:15
 */
@RestController
@RequestMapping("ware/wareinfo")
public class WareInfoController {
    @Autowired
    private WareInfoService wareInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wareInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
        public R info(@PathVariable("id") Long id){
		WareInfoEntity wareInfo = wareInfoService.getById(id);

        return R.ok().put("wareInfo", wareInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody WareInfoEntity wareInfo){
		wareInfoService.save(wareInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody WareInfoEntity wareInfo){
		wareInfoService.updateById(wareInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody Long[] ids){
		wareInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
