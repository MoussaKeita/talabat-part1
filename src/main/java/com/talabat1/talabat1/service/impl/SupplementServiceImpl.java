/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.service.impl;

import com.talabat1.talabat1.bean.Supplement;
import com.talabat1.talabat1.dao.SupplementDao;
import com.talabat1.talabat1.service.SupplementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Keita Moussa
 */
@Service
public class SupplementServiceImpl implements SupplementService{
 @Autowired
 private SupplementDao supplementDao;
    @Override
    public Supplement findSupplementByLibelle(String libelle) {
       return supplementDao.findByLibelle(libelle);
    }

    @Override
    public int creer(Supplement supplement) {
        Supplement su = findSupplementByLibelle(supplement.getLibelle());
        if(su!=null){
            return -1;
        }
        else{
         // supplement.set
            supplementDao.save(supplement);
        }
        return 1;
    }

    @Override
    public int payer(String libelle, Double montant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int supprimer(String libelle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SupplementDao getSupplementDao() {
        return supplementDao;
    }

    public void setSupplementDao(SupplementDao supplementDao) {
        this.supplementDao = supplementDao;
    }
    
}
