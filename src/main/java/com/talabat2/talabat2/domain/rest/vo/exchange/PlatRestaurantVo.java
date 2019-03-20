/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.vo.exchange;

/**
 *
 * @author ASUS
 */
public class PlatRestaurantVo {

    private Long id;
    private String reference;
    private String date;
    private PlatVo platVo;
    private RestaurantVo restaurantVo;
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PlatVo getPlatVo() {
        return platVo;
    }

    public void setPlatVo(PlatVo platVo) {
        this.platVo = platVo;
    }

    public RestaurantVo getRestaurantVo() {
        return restaurantVo;
    }

    public void setRestaurantVo(RestaurantVo restaurantVo) {
        this.restaurantVo = restaurantVo;
    }
    

}
