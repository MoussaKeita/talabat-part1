/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.rest.vo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author wadie
 */
public class CommandeVo {

    private Long id;
    private String reference;
    private String totalPaiement;
    private String total;
    private Date DateCommande;
    private ClientVo clientVo;
    private List<PlatCommandeVo> platCommandesVo;
    
    // les getters et setters //

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

    public String getTotalPaiement() {
        return totalPaiement;
    }

    public void setTotalPaiement(String totalPaiement) {
        this.totalPaiement = totalPaiement;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Date getDateCommande() {
        return DateCommande;
    }

    public void setDateCommande(Date DateCommande) {
        this.DateCommande = DateCommande;
    }

    public ClientVo getClientVo() {
        return clientVo;
    }

    public void setClientVo(ClientVo clientVo) {
        this.clientVo = clientVo;
    }

    public List<PlatCommandeVo> getPlatCommandesVo() {
        return platCommandesVo;
    }

    public void setPlatCommandesVo(List<PlatCommandeVo> platCommandesVo) {
        this.platCommandesVo = platCommandesVo;
    }
    
}
