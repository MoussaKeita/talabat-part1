/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.vo;

import java.util.List;

/**
 *
 * @author Keita Moussa
 */
public class SupplementVo {
    private Long id;
    private String libelle;
    private String total_Supp;
    private String type_Supp;
    private PlatCommandeVo platCommandeVo;
    private List<SupplementPlatVo> supplementPlatVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTotal_Supp() {
        return total_Supp;
    }

    public void setTotal_Supp(String total_Supp) {
        this.total_Supp = total_Supp;
    }

    public String getType_Supp() {
        return type_Supp;
    }

    public void setType_Supp(String type_Supp) {
        this.type_Supp = type_Supp;
    }

    public PlatCommandeVo getPlatCommandeVo() {
        return platCommandeVo;
    }

    public void setPlatCommandeVo(PlatCommandeVo platCommandeVo) {
        this.platCommandeVo = platCommandeVo;
    }

    public List<SupplementPlatVo> getSupplementPlatVo() {
        return supplementPlatVo;
    }

    public void setSupplementPlatVo(List<SupplementPlatVo> supplementPlatVo) {
        this.supplementPlatVo = supplementPlatVo;
    }
    
    
}
