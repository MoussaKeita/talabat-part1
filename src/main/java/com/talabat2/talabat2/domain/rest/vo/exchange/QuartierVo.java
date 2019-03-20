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
public class QuartierVo {

    private Long id;
    private String nomQuartier;
    private VilleVo villeVo;
    private List<RueVo> ruesVo;

    public List<RueVo> getRuesVo() {
        return ruesVo;
    }

    public void setRuesVo(List<RueVo> ruesVo) {
        this.ruesVo = ruesVo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomQuartier() {
        return nomQuartier;
    }

    public void setNomQuartier(String nomQuartier) {
        this.nomQuartier = nomQuartier;
    }

    public VilleVo getVilleVo() {
        return villeVo;
    }

    public void setVilleVo(VilleVo villeVo) {
        this.villeVo = villeVo;
    }

}
