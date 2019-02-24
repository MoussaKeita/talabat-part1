/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.rest;

import com.talabat1.talabat1.bean.Commande;
import com.talabat1.talabat1.service.CommandeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Keita Moussa
 */
@RestController
@RequestMapping("talabat1/commandes")
public class CommandeRest {

    @Autowired
    private CommandeService commandeService;// meme chose que le proxy//

    @GetMapping("")
    public List<Commande> findAllCommande() {
        return commandeService.findAllCommande();
    }

    @GetMapping("/reference/{reference}")
    public Commande findCommandeByReference(@PathVariable String reference) {
        return commandeService.findCommandeByReference(reference);
    }

    @PostMapping("/")
    public int creer(@RequestBody Commande commande) {
        return commandeService.creer(commande);
    }

    @PutMapping("/reference/{reference}/montant/{montant}")
    public int payer(@PathVariable String reference,@PathVariable Double montant) {
        return commandeService.payer(reference, montant);
    }

    @DeleteMapping("/reference{reference}")
    public int supprimer(@PathVariable String reference) {
        return commandeService.supprimer(reference);
    }

    public CommandeService getCommandeService() {
        return commandeService;
    }

    public void setCommandeService(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

}
