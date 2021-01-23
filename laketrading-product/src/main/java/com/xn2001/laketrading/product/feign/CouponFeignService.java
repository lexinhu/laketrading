package com.xn2001.laketrading.product.feign;

import com.xn2001.common.to.SkuReductionTo;
import com.xn2001.common.utils.R;
import com.xn2001.common.to.SpuBoundTo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 乐心湖
 * @date 2021/1/20 21:29
 **/
@FeignClient("laketrading-coupon")
public interface CouponFeignService {

    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("/coupon/skufullreduction/saveinfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
