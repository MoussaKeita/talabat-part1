/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.service;

import com.talabat1.talabat1.domain.bean.Commande;
import java.util.List;

/**
 *
 * @author Keita Moussa
 */
public interface CommandeService {
    public List<Commande> findAllCommande();
    public Commande findCommandeByReference(String reference);
    public Commande creer (Commande commande);
    public int payer (String reference , Double montant);
   // public int modifier(Commande commande);
    public int supprimer(String reference);
}
