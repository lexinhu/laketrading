package com.xn2001.laketrading.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 乐心湖
 * @date 2021/1/14 0:10
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttrGroupRelationVo {
    // [{"attrId":1,"attrGroupId":2}]
    private Long attrId;
    private Long attrGroupId;
}
