/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.vo;

import com.talabat1.talabat1.domain.bean.TypePaiement;
import java.util.Date;

/**
 *
 * @author Keita Moussa
 */
public class PaiementVo {
    private Long id;
    private String reference;
    private Double montant;
    private Date date_de_paiment;
    private TypePaiement typePaiement;
    private CommandeVo commandeVo;

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

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Date getDate_de_paiment() {
        return date_de_paiment;
    }

    public void setDate_de_paiment(Date date_de_paiment) {
        this.date_de_paiment = date_de_paiment;
    }

    public TypePaiement getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(TypePaiement typePaiement) {
        this.typePaiement = typePaiement;
    }

    public CommandeVo getCommandeVo() {
        return commandeVo;
    }

    public void setCommandeVo(CommandeVo commandeVo) {
        this.commandeVo = commandeVo;
    }

    
}
