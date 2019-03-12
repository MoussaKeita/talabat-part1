/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest;

import com.talabat1.talabat1.domain.bean.Commande;
import com.talabat1.talabat1.domain.bean.PlatCommande;
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
@CrossOrigin(origins ={"http://localhost:4200/"})
public class PlatCommandeRest {

    @Autowired 
    private PlatCommandeService platCommandeService;
    
    @Autowired
    @Qualifier("platCommandeConverter")
    private AbstractConverter<PlatCommande ,PlatCommandeVo> platCommandeConverter;

    @GetMapping("/reference/{reference}")
    public List<PlatCommandeVo> findByCommmandeReference(@PathVariable("reference") String reference) {
        return new PlatCommandeConverter().toVo(platCommandeService.findByCommmande(reference));
    }
    public int savePlatCommande(Commande commande, List<PlatCommande> platCommandes) {
        return platCommandeService.savePlatCommande(commande, platCommandes);
    }
//    @PostMapping("/")
//    public PlatCommandeVo savePlat(@RequestBody PlatCommandeVo PlatcommandeVo) {
//        final PlatCommandeConverter platCommandeConverter = new PlatCommandeConverter();
//        PlatCommande platCommande = platCommandeConverter.toItem(PlatcommandeVo);
//
//        return platCommandeConverter.toVO(platCommandeService.savePlat(platCommande));
//    }

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
