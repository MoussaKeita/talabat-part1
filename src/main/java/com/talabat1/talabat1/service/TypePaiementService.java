/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.service;

import com.talabat1.talabat1.bean.Paiement;
import com.talabat1.talabat1.bean.TypePaiement;
import java.util.List;

/**
 *
 * @author wadie
 */
public interface TypePaiementService {
    public List<TypePaiement> findByLibelle(String libelle);
}
