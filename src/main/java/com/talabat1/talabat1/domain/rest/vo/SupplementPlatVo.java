/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.vo;

/**
 *
 * @author Keita Moussa
 */
public class SupplementPlatVo {
    private Long id;
    private String libelleSupp;
    private String quantite;
    private String prix;
    private SupplementVo supplementVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public SupplementVo getSupplementVo() {
        return supplementVo;
    }

    public void setSupplementVo(SupplementVo supplementVo) {
        this.supplementVo = supplementVo;
    }

    public String getLibelleSupp() {
        return libelleSupp;
    }

    public void setLibelleSupp(String libelleSupp) {
        this.libelleSupp = libelleSupp;
    }
    
    
}
