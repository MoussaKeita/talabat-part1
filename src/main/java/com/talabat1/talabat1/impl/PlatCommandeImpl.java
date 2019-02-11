/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.impl;

import com.talabat1.talabat1.bean.PlatCommande;
import com.talabat1.talabat1.dao.PlatCommandeDao;
import com.talabat1.talabat1.service.PlatCommandeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Keita Moussa
 */
public class PlatCommandeImpl implements PlatCommandeService{
 @Autowired
 private PlatCommandeDao platCommandeDao;
    @Override
    public List<PlatCommande> findPlatCommmandeByReference(String reference) {
     return platCommandeDao.findPlatCommmandeByReference(reference);
    }

    @Override
    public int creer(PlatCommande platCommande) {
         platCommandeDao.save(platCommande);
         return 1;
    }
/**********GETTER AND SETTER******************/
        public PlatCommandeDao getPlatCommandeDao() {
        return platCommandeDao;
    }

    public void setPlatCommandeDao(PlatCommandeDao platCommandeDao) {
        this.platCommandeDao = platCommandeDao;
    }
}
