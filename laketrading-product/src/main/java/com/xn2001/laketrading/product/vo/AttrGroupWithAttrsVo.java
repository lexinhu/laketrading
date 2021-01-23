package com.xn2001.laketrading.product.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.xn2001.laketrading.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * @author 乐心湖
 * @date 2021/1/18 4:11
 **/
@Data
public class AttrGroupWithAttrsVo {
    /**
     * 分组id
     */
    @TableId
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;
}
