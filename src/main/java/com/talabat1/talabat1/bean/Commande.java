/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Keita Moussa
 */
@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Double totalPaiement;
    private Double total;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCommande;
    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "commande")
    private List<PlatCommande> platCommandes;

    @OneToOne(mappedBy = "commande")
    private Paiement paiement;
    
    public Paiement getPaiement() {
        return paiement;
    }

    // les getters et setters //
    public void setPaiement(Paiement paiement) {    
        this.paiement = paiement;
    }

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


    public Double getTotalPaiement() {
        return totalPaiement;
    }

    public void setTotalPaiement(Double totalPaiement) {
        this.totalPaiement = totalPaiement;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public List<PlatCommande> getPlatCommandes() {
        return platCommandes;
    }

    public void setPlatCommandes(List<PlatCommande> platCommandes) {
        this.platCommandes = platCommandes;
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
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.talabat1.talabat1.bean.Commande[ id=" + id + " ]";
    }

}
