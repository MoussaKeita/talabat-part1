/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest;

import com.talabat1.talabat1.domain.bean.Commande;
import com.talabat1.talabat1.domain.model.service.CommandeService;
import com.talabat1.talabat1.domain.rest.converter.CommandeConverter;
import com.talabat1.talabat1.domain.rest.vo.CommandeVo;
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
    public List<CommandeVo> findAllCommande() {
        return new CommandeConverter().toVo(commandeService.findAllCommande());
    }

    @GetMapping("/reference/{reference}")
    public CommandeVo findCommandeByReference(@PathVariable String reference) {
        return new  CommandeConverter().toVO(commandeService.findCommandeByReference(reference));
    }

    @PostMapping("/")
    public CommandeVo creer(@RequestBody CommandeVo commandeVo) {
        final CommandeConverter commandeConverter = new CommandeConverter();
        Commande commande = commandeConverter.toItem(commandeVo);
        return commandeConverter.toVO(commandeService.creer(commande));
    }

    @PutMapping("/reference/{reference}/montant/{montant}")
    public int payer(@PathVariable String reference,@PathVariable Double montant) {
        return (commandeService.payer(reference, montant));
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
