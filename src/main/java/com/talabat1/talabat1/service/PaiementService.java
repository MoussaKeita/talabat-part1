/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.service;

import com.talabat1.talabat1.bean.Paiement;

/**
 *
 * @author wadie
 */
public interface PaiementService {

   public Paiement findByReference(String reference);
   public int supprimer(String reference);

}
