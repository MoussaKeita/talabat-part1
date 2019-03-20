/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.vo.exchange;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class PlatVo {

    private Long id;
    private String nom;
    private String reference_plat;
    private List<PlatRestaurantVo> platRestaurantsVo;
    

    public String getReference_plat() {
        return reference_plat;
    }

    public void setReference_plat(String reference_plat) {
        this.reference_plat = reference_plat;
    }

    public List<PlatRestaurantVo> getPlatRestaurantsVo() {
        return platRestaurantsVo;
    }

    public void setPlatRestaurantsVo(List<PlatRestaurantVo> platRestaurantsVo) {
        this.platRestaurantsVo = platRestaurantsVo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
