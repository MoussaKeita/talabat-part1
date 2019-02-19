/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.service.impl;

import com.talabat1.talabat1.bean.Commande;
import com.talabat1.talabat1.bean.PlatCommande;
import com.talabat1.talabat1.dao.CommandeDao;
import com.talabat1.talabat1.service.CommandeService;
import com.talabat1.talabat1.service.PlatCommandeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Keita Moussa
 */
@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeDao commandeDao;
    @Autowired
    private PlatCommandeService platCommandeService;

    @Override
    public List<Commande> findAllCommande() {
        return commandeDao.findAll();
    }

    @Override
    public Commande findCommandeByReference(String reference) {
        return commandeDao.findByReference(reference);
    }

    @Override
    public int creer(Commande commande) {
        Commande c = findCommandeByReference(commande.getReference());
        if (c != null) {
            return -1;
        } else {
            double total = 0.0;
            List<PlatCommande> platCommandes = commande.getPlatCommandes();
            if (platCommandes != null) {
                for (PlatCommande platCommande : platCommandes) {
                    total += platCommande.getPrix() * platCommande.getQuantite();
                }
            }
            commande.setTotal(total);
            /**
             * ************************************
             */
            commande.setTotalPaiement(0D);
            commandeDao.save(commande);
        }

        return 1;
    }

    @Override
    public int payer(String reference, Double montant) {
        Commande c = findCommandeByReference(reference);
        if (c == null) {
            return -1;
        } else if (c.getTotalPaiement() + montant > c.getTotal()) {
            return -2;
        } else {//reste à verifier//
            Double nvMontant = c.getTotalPaiement() + montant;
            c.setTotal(nvMontant);
        }
        return 1;
    }

//    @Override
//    public int modifier(Commande commande) {
//     Commande c = findCommandeByReference(commande.getReference());
//     if(c== null){
//         return -1;
//     }
//     commandeDao.update(commande);
//    }
    @Override
    public int supprimer(String reference) {
        Commande c = findCommandeByReference(reference);
        if (c == null) {
            return -1;
        } else {
            commandeDao.delete(c);
        }
        return 1;
    }

    public CommandeDao getCommandeDao() {
        return commandeDao;
    }

    public void setCommandeDao(CommandeDao commandeDao) {
        this.commandeDao = commandeDao;
    }

    public PlatCommandeService getPlatCommandeService() {
        return platCommandeService;
    }

    public void setPlatCommandeService(PlatCommandeService platCommandeService) {
        this.platCommandeService = platCommandeService;
    }

}
