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
public class RueVo {

    private Long id;
    private String nomRue;
    private QuartierVo quartierVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public QuartierVo getQuartierVo() {
        return quartierVo;
    }

    public void setQuartierVo(QuartierVo quartierVo) {
        this.quartierVo = quartierVo;
    }
    

}
