package com.xn2001.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 乐心湖
 * @date 2021/1/20 23:11
 **/
@Data
public class SkuReductionTo {
    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPriceTo> memberPrice;
}
