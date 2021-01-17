package com.xn2001.laketrading.product.vo;

import lombok.Data;

/**
 * @author 乐心湖
 * @date 2020/9/18 22:20
 **/
@Data
public class AttrRespVo extends AttrVo{
    //所属分类名字
    private String catelogName;
    //所属分组名字
    private String groupName;

    private Long[] catelogPath;
}
