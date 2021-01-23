/**
 * Copyright 2021 bejson.com
 */
package com.xn2001.laketrading.product.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}