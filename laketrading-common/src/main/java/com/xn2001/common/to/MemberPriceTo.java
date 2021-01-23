/**
 * Copyright 2021 bejson.com
 */
package com.xn2001.common.to;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemberPriceTo {

    private Long id;
    private String name;
    private BigDecimal price;

}