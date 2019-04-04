/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.proxy;


import com.talabat2.talabat2.domain.rest.vo.exchange.PlatRestaurantVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Keita Moussa
 */
@FeignClient(name="microservice1-talabat2" , url="localhost:8090")
public interface PlatRestaurantProxy {
    
    @GetMapping("talabat2/plats/reference/{reference}")//le lien complet//
    public PlatRestaurantVo findByReference(@PathVariable("reference") String reference);//la signature//
}
