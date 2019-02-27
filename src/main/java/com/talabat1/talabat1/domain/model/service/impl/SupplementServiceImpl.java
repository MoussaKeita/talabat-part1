/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.service.impl;

import com.talabat1.talabat1.domain.bean.Supplement;
import com.talabat1.talabat1.domain.model.dao.SupplementDao;
import com.talabat1.talabat1.domain.model.service.SupplementService;
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
    public Supplement creer(Supplement supplement) {
        Supplement su = findSupplementByLibelle(supplement.getLibelle());
        if(su!=null){
            return null;
        }
        else{
         supplement.setTotal_Supp(0D);
            supplementDao.save(supplement);
        }
        return supplement;
    }

    @Override
    public int payer(String libelle, Double montant) {
      Supplement su = findSupplementByLibelle(libelle);
      if(su ==null){
          return -1;
      }
      else{
          double total=0.0;
          
          double nvMontant = su.getTotal_Supp()+ montant;
          su.setTotal_Supp(montant);
      }
      return 1;
    }

    @Override
    public int supprimer(String libelle) {
       Supplement su = findSupplementByLibelle(libelle);
       if(su==null){
           return -1;
       }
       else{
           supplementDao.delete(su);
       }
       return 1;
    }

    public SupplementDao getSupplementDao() {
        return supplementDao;
    }

    public void setSupplementDao(SupplementDao supplementDao) {
        this.supplementDao = supplementDao;
    }
    
}
