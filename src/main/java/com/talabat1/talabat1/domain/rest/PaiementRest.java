/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest;

import com.talabat1.talabat1.domain.bean.Paiement;
import com.talabat1.talabat1.domain.model.service.PaiementService;
import com.talabat1.talabat1.domain.rest.converter.PaiementConverter;
import com.talabat1.talabat1.domain.rest.vo.PaiementVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Keita Moussa
 */
@RestController()
@RequestMapping("talabat1/paiements")
public class PaiementRest {
    @Autowired
    private PaiementService paiementService;
    
@GetMapping("/reference/{reference}")
    public PaiementVo findByReference(@PathVariable String reference) {
        return new PaiementConverter().toVO(paiementService.findByReference(reference));
    }
@DeleteMapping("/reference/{reference}")
    public int supprimer(@PathVariable String reference) {
        return paiementService.supprimer(reference);
    }
    
    

    public PaiementService getPaiementService() {
        return paiementService;
    }

    public void setPaiementService(PaiementService paiementService) {
        this.paiementService = paiementService;
    }
}
