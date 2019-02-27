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
@RestController()
@RequestMapping("talabat1/supplements")
public class SupplementRest {
    @Autowired
    private SupplementService supplementService;
@GetMapping("/libelle/{libelle}")
    public SupplementVo findSupplementByLibelle(@PathVariable String libelle) {
        return new SupplementConverter().toVO(supplementService.findSupplementByLibelle(libelle));
    }
@PostMapping("/")
    public SupplementVo creer(@RequestBody SupplementVo supplementVo) {
        final SupplementConverter supplementConverter = new SupplementConverter();
        Supplement supplement = supplementConverter.toItem(supplementVo);
        return supplementConverter.toVO(supplementService.creer(supplement));
    }
@PutMapping("/libelle/{libelle}/double/{double}")
    public int payer(@PathVariable String libelle,@PathVariable Double montant) {
        return supplementService.payer(libelle, montant);
    }
@DeleteMapping("/libelle/{libelle}")
    public int supprimer(@PathVariable String libelle) {
        return supplementService.supprimer(libelle);
    }

    
    
    public SupplementService getSupplementService() {
        return supplementService;
    }

    public void setSupplementService(SupplementService supplementService) {
        this.supplementService = supplementService;
    } 
}
