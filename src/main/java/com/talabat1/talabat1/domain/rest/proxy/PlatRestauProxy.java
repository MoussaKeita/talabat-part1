/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.proxy;

import com.talabat2.talabat2.domain.rest.vo.exhange.PlatRestauVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Keita Moussa
 */
@FeignClient(name="microservice1-talabat1" , url="localhost:8099")
public interface PlatRestauProxy {
    
    @GetMapping("talabat2/plats/reference/{reference}")//le lien complet//
    public PlatRestauVo findByReference(@PathVariable String reference);//la signature//
}
