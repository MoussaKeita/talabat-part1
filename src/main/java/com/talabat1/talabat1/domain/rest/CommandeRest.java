/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest;

import com.talabat1.talabat1.domain.bean.Commande;
import com.talabat1.talabat1.domain.bean.PlatCommande;
import com.talabat1.talabat1.domain.model.service.CommandeService;
import com.talabat1.talabat1.domain.model.service.PlatCommandeService;
import com.talabat1.talabat1.domain.rest.converter.AbstractConverter;
import com.talabat1.talabat1.domain.rest.converter.CommandeConverter;
import com.talabat1.talabat1.domain.rest.converter.PlatCommandeConverter;
import com.talabat1.talabat1.domain.rest.vo.CommandeVo;
import com.talabat1.talabat1.domain.rest.vo.PlatCommandeVo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/talabat1/commandes")
@CrossOrigin(origins ={"http://localhost:4200/"})// l'acces à Angular pour qu'il puisse invoquer le MicroService//
public class CommandeRest {
    
     @Autowired 
    private PlatCommandeService platCommandeService;

    @Autowired
    private CommandeService commandeService;// meme chose que le proxy//
    
    @Autowired
    @Qualifier("commandeConverter")
    private AbstractConverter<Commande ,CommandeVo> commandeConverter;
/*****************************************************/
        @Autowired
    @Qualifier("platCommandeConverter")
    private AbstractConverter<PlatCommande ,PlatCommandeVo> platCommandeConverter;

    @GetMapping("/reference/{reference}/plat-Commandes/")
    public List<PlatCommandeVo> findByCommmandeReference(@PathVariable("reference") String reference) {
        return new PlatCommandeConverter().toVo(platCommandeService.findByCommmande(reference));
    }
    /*****************************************************/
    @GetMapping("")
    public List<CommandeVo> findAllCommande() {
        return new CommandeConverter().toVo(commandeService.findAllCommande());
    }

    @GetMapping("/reference/{reference}")
    public CommandeVo findCommandeByReference(@PathVariable ("reference")String reference) {
        return new  CommandeConverter().toVO(commandeService.findByReference(reference));
    }
    @PostMapping("/")
    public CommandeVo saveCommandeWithPlats(@RequestBody CommandeVo commandeVo) {
        final CommandeConverter commandeConverter = new CommandeConverter();
        Commande commande = commandeConverter.toItem(commandeVo);
        return commandeConverter.toVO(commandeService.saveCommandeWithPlats(commande));
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

    public AbstractConverter<Commande, CommandeVo> getCommandeConverter() {
        return commandeConverter;
    }

    public void setCommandeConverter(AbstractConverter<Commande, CommandeVo> commandeConverter) {
        this.commandeConverter = commandeConverter;
    }

    public PlatCommandeService getPlatCommandeService() {
        return platCommandeService;
    }

    public void setPlatCommandeService(PlatCommandeService platCommandeService) {
        this.platCommandeService = platCommandeService;
    }

    public AbstractConverter<PlatCommande, PlatCommandeVo> getPlatCommandeConverter() {
        return platCommandeConverter;
    }

    public void setPlatCommandeConverter(AbstractConverter<PlatCommande, PlatCommandeVo> platCommandeConverter) {
        this.platCommandeConverter = platCommandeConverter;
    }

}
