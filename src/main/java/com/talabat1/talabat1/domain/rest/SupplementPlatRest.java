/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest;

import com.talabat1.talabat1.domain.bean.Supplement;
import com.talabat1.talabat1.domain.model.service.SupplementService;
import com.talabat1.talabat1.domain.rest.converter.SupplementConverter;
import com.talabat1.talabat1.domain.rest.vo.SupplementVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Keita Moussa
 */
@RestController()
@RequestMapping("talabat1/supplementPlats")
public class SupplementPlatRest {
    @Autowired
    private SupplementService supplementService;

    public SupplementVo findSupplementByLibelle(String libelle) {
        return new SupplementConverter().toVO(supplementService.findSupplementByLibelle(libelle));
    }

    public SupplementVo creer(SupplementVo supplementVo) {
        final SupplementConverter supplementConverter = new SupplementConverter();
        Supplement supplement = supplementConverter.toItem(supplementVo);
        return supplementConverter.toVO(supplementService.creer(supplement));
    }

    public int payer(String libelle, Double montant) {
        return supplementService.payer(libelle, montant);
    }

    public int supprimer(String libelle) {
        return supplementService.supprimer(libelle);
    }
    

    public SupplementService getSupplementService() {
        return supplementService;
    }

    public void setSupplementService(SupplementService supplementService) {
        this.supplementService = supplementService;
    }           
}
