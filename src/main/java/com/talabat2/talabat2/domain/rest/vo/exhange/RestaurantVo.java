/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.vo.exhange;

import java.util.List;

/**
 *
 * @author Keita Moussa
 */
public class RestaurantVo {
     private Long id;
    private String reference;
    private String nom;
    private String adresse;
    private String tel;
    private List<PlatRestauVo> platRestauVo;

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<PlatRestauVo> getPlatRestauVo() {
        return platRestauVo;
    }

    public void setPlatRestauVo(List<PlatRestauVo> platRestauVo) {
        this.platRestauVo = platRestauVo;
    }
    
    

}
