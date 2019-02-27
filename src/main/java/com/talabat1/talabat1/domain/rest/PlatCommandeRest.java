/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest;

import com.talabat1.talabat1.domain.bean.Commande;
import com.talabat1.talabat1.domain.bean.PlatCommande;
import com.talabat1.talabat1.domain.model.service.PlatCommandeService;
import com.talabat1.talabat1.domain.rest.converter.CommandeConverter;
import com.talabat1.talabat1.domain.rest.converter.PlatCommandeConverter;
import com.talabat1.talabat1.domain.rest.vo.CommandeVo;
import com.talabat1.talabat1.domain.rest.vo.PlatCommandeVo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Keita Moussa
 */
@RestController()
@RequestMapping("talabat1/platCommandes")
public class PlatCommandeRest {

    @Autowired
    private PlatCommandeService platCommandeService;

    @GetMapping("/reference/{reference}")
    public List<PlatCommandeVo> findPlatCommmandeByReference(@PathVariable String reference) {
        return new PlatCommandeConverter().toVo(platCommandeService.findPlatCommmandeByReference(reference));
    }

    @PostMapping("/")
    public CommandeVo savePlat(@RequestBody CommandeVo commandeVo) {
        final CommandeConverter commandeConverter = new CommandeConverter();
        Commande commande = commandeConverter.toItem(commandeVo);

        return commandeConverter.toVO(platCommandeService.savePlat(commande));
    }

    public PlatCommandeService getPlatCommandeService() {
        return platCommandeService;
    }

    public void setPlatCommandeService(PlatCommandeService platCommandeService) {
        this.platCommandeService = platCommandeService;
    }

}
