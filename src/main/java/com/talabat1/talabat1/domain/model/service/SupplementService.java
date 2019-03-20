/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.service;

import com.talabat1.talabat1.domain.bean.Commande;
import com.talabat1.talabat1.domain.bean.Supplement;
import java.util.List;

/**
 *
 * @author Keita Moussa
 */
public interface SupplementService {
    public List<Supplement> findAll();
    public Supplement findByLibelle(String libelle);
    public Supplement saveSupplementWithSupPlat(Supplement supplement);
    public int payer (String libelle, Double montant);
   // public int modifier(Commande commande);
    public int supprimer(String libelle);      
}
