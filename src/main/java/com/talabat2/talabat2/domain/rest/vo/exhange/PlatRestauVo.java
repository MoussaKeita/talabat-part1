/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.vo.exhange;

//import com.talabat2.talabat2.domain.bean.Restaurant;

/**
 *
 * @author Keita Moussa
 */
public class PlatRestauVo {
    private Long id;
    private String reference;
    private String nom;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public RestaurantVo getRestaurantVo() {
        return restaurantVo;
    }

    public void setRestaurantVo(RestaurantVo restaurantVo) {
        this.restaurantVo = restaurantVo;
    }
  
}
