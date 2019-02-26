/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.service;

import com.talabat1.talabat1.domain.bean.Commande;
import com.talabat1.talabat1.domain.bean.PlatCommande;
import java.util.List;

/**
 *
 * @author Keita Moussa
 */
public interface PlatCommandeService {
    
    public List<PlatCommande> findPlatCommmandeByReference(String reference);
    public Commande savePlat (Commande commande);
   // public int modifier(Commande commande);
}
