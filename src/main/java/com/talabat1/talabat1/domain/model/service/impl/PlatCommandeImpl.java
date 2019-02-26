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
    public List<PlatCommande> findPlatCommmandeByReference(String reference) {
     return platCommandeDao.findByCommandeReference(reference);
    }

    @Override
    public Commande savePlat(Commande commande) {
       List<PlatCommande> platCommandes = commande.getPlatCommandes();
       
       if(platCommandes !=null){
       for(PlatCommande platCommande : platCommandes){
           platCommande.setCommande(commande);//association de la commande avec la liste PlatCommande//
           platCommandeDao.save(platCommande);
                    }
       }
       return commande;
    }
/**********GETTER AND SETTER******************/
        public PlatCommandeDao getPlatCommandeDao() {
        return platCommandeDao;
    }

    public void setPlatCommandeDao(PlatCommandeDao platCommandeDao) {
        this.platCommandeDao = platCommandeDao;
    }

}
