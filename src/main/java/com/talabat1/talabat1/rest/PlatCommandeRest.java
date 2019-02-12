/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.rest;

import com.talabat1.talabat1.bean.Commande;
import com.talabat1.talabat1.bean.PlatCommande;
import com.talabat1.talabat1.service.PlatCommandeService;
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
    public List<PlatCommande> findPlatCommmandeByReference(@PathVariable String reference) {
        return platCommandeService.findPlatCommmandeByReference(reference);
    }
@PostMapping("/")
    public int savePlat(@RequestBody Commande commande) {
        return platCommandeService.savePlat(commande);
    }

    
    
    public PlatCommandeService getPlatCommandeService() {
        return platCommandeService;
    }

    public void setPlatCommandeService(PlatCommandeService platCommandeService) {
        this.platCommandeService = platCommandeService;
    }
    
    
}
