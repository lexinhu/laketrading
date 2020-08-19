package com.xn2001.laketrading.member.feign;

import com.xn2001.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 乐心湖
 * @date 2020/8/18 16:33
 **/
@FeignClient("laketrading-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    R membercoupons();
}
