package com.example.demo;

package com.couponservice.coupon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/coupons")
public class product {

    @Autowired
    private CouponRepository couponRepository;

    @GetMapping(value = "/list")
    public List<Coupon> getAllCoupons(){
        return couponRepository.findAll();
    }
    @PostMapping(value = "/add")
    public Coupon addCoupon(@RequestBody Coupon coupon){
        return couponRepository.save(coupon);
    }
    @DeleteMapping(value = "/delete/{couponID}")
    public void deleteProduct(@PathVariable String couponID) {
        System.out.println("Delete method called");
        couponRepository.deleteById(couponID);
    }
}
