/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Keita Moussa
 */
@Entity
public class Supplement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private Double total_Supp;
    private String type_Supp;
    @ManyToOne
    private PlatCommande platCommande;
    
    @OneToMany(mappedBy = "supplement")
    private List<SupplementPlat> supplementPlats;

    
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

    public Double getTotal_Supp() {
        return total_Supp;
    }

    public void setTotal_Supp(Double total_Supp) {
        this.total_Supp = total_Supp;
    }

    public String getType_Supp() {
        return type_Supp;
    }

    public void setType_Supp(String type_Supp) {
        this.type_Supp = type_Supp;
    }

    public PlatCommande getPlatCommande() {
        return platCommande;
    }

    public void setPlatCommande(PlatCommande platCommande) {
        this.platCommande = platCommande;
    }

    public List<SupplementPlat> getSupplementPlats() {
        return supplementPlats;
    }

    public void setSupplementPlats(List<SupplementPlat> supplementPlats) {
        this.supplementPlats = supplementPlats;
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
        if (!(object instanceof Supplement)) {
            return false;
        }
        Supplement other = (Supplement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.talabat1.talabat1.bean.Supplement[ id=" + id + " ]";
    }

}
