/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Keita Moussa
 */
@Entity
public class TypeSupplement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom_Type;
    private Double quantite;
    @ManyToOne
    private Supplement supplement;
    @ManyToOne
    private PlatCommande platCommande;

    // les getters et setters //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Double getQuantite() {
        return quantite;
    }

    public void setQuantite(Double quantite) {
        this.quantite = quantite;
    }

    public Supplement getSupplement() {
        return supplement;
    }

    public void setSupplement(Supplement supplement) {
        this.supplement = supplement;
    }

    public PlatCommande getPlatCommande() {
        return platCommande;
    }

    public void setPlatCommande(PlatCommande platCommande) {
        this.platCommande = platCommande;
    }

    public String getNom_Type() {
        return nom_Type;
    }

    public void setNom_Type(String nom_Type) {
        this.nom_Type = nom_Type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeSupplement)) {
            return false;
        }
        TypeSupplement other = (TypeSupplement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.talabat1.talabat1.bean.TypeSupplement[ id=" + id + " ]";
    }

}
