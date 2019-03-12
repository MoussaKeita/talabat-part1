/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.service.impl;

import com.talabat1.talabat1.domain.bean.Commande;
import com.talabat1.talabat1.domain.bean.PlatCommande;
import com.talabat1.talabat1.domain.model.dao.PlatCommandeDao;
import com.talabat1.talabat1.domain.model.service.PlatCommandeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Keita Moussa
 */
@Service
public class PlatCommandeImpl implements PlatCommandeService{
 @Autowired
 private PlatCommandeDao platCommandeDao;
 
    @Override
    public List<PlatCommande> findByCommmande(String reference) {
   return platCommandeDao.findByCommandeReference(reference);
    }
        @Override
    public int savePlatCommande(Commande commande, List<PlatCommande> platCommandes) {// ici on a la liste en pam : donc pas besoin de le télécharger//
        if(platCommandes == null || platCommandes.isEmpty()){
            return -1;
        }
        else{
            for(PlatCommande platCommande : platCommandes){
                platCommande.setCommande(commande);//association de la commande avec plat Commande//
                platCommandeDao.save(platCommande);
            }
        }
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

