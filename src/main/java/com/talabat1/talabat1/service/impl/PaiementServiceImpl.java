/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.service.impl;

import com.talabat1.talabat1.bean.Paiement;
import com.talabat1.talabat1.dao.PaiementDao;
import com.talabat1.talabat1.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wadie
 */
@Service
public class PaiementServiceImpl implements PaiementService {
   @Autowired
    private PaiementDao paiementDao;
    @Override
    public Paiement findByReference(String reference) {
      return paiementDao.findByReference(reference);
    }

    @Override
    public int supprimer(String reference) {
       Paiement paiement = findByReference(reference);
       if(paiement == null){
           return -1;
       }
       else{
           paiementDao.delete(paiement);
       }
       return 1;
    }

    public PaiementDao getPaiementDao() {
        return paiementDao;
    }

    public void setPaiementDao(PaiementDao paiementDao) {
        this.paiementDao = paiementDao;
    }

}
