/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest;

import com.talabat1.talabat1.domain.bean.TypePaiement;
import com.talabat1.talabat1.domain.model.service.TypePaiementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Keita Moussa
 */
@RestController()
@RequestMapping("talabat1/typePaiements")
public class TypePaiementRest {
    @Autowired
    private TypePaiementService typePaiementService;
@GetMapping("/libelle/{libelle}")
    public List<TypePaiement> findByLibelle(@PathVariable String libelle) {
        return typePaiementService.findByLibelle(libelle);
    }

    
    
    public TypePaiementService getTypePaiementService() {
        return typePaiementService;
    }

    public void setTypePaiementService(TypePaiementService typePaiementService) {
        this.typePaiementService = typePaiementService;
    }
    
    
}
