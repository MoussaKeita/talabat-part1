/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.rest.vo;

import com.talabat1.talabat1.bean.TypeSupplement;
import java.util.List;

/**
 *
 * @author wadie
 */
public class PlatCommandeVo {

    private List<TypeSupplement> typeSupplements;
    private static final long serialVersionUID = 1L;
    private Long id;
    private String refPlat;
    private String prix;
    private String quantite;
    private CommandeVo commandeVo;
    
    // les getters et setters //

    public List<TypeSupplement> getTypeSupplements() {
        return typeSupplements;
    }

    public void setTypeSupplements(List<TypeSupplement> typeSupplements) {
        this.typeSupplements = typeSupplements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefPlat() {
        return refPlat;
    }

    public void setRefPlat(String refPlat) {
        this.refPlat = refPlat;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public CommandeVo getCommandeVo() {
        return commandeVo;
    }

    public void setCommandeVo(CommandeVo commandeVo) {
        this.commandeVo = commandeVo;
    }
    
    
}
