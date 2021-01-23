package com.xn2001.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 乐心湖
 * @date 2021/1/20 22:46
 **/
@Data
public class SpuBoundTo {

    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;

}
