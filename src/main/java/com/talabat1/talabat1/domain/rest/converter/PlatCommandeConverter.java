/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.converter;

import com.talabat1.talabat1.commun.NumberUtil;
import com.talabat1.talabat1.domain.bean.PlatCommande;
import com.talabat1.talabat1.domain.rest.vo.PlatCommandeVo;

/**
 *
 * @author Keita Moussa
 */
public class PlatCommandeConverter extends AbstractConverter<PlatCommande, PlatCommandeVo>{

    @Override
    public PlatCommande toItem(PlatCommandeVo vo) {
        if(vo==null){
            return null;
        }
        else{
           PlatCommande item = new PlatCommande();
           item.setId(vo.getId());
           item.setRefPlat(vo.getRefPlat());
           item.setPrix(NumberUtil.toDouble(vo.getPrix()));
           item.setQuantite(NumberUtil.toDouble(vo.getQuantite()));
           item.setCommande(new CommandeConverter().toItem(vo.getCommandeVo()));
          // item.setSupplements(new SupplementConverter().toItem(vo.get));
          return item;
        }    
    }

    @Override
    public PlatCommandeVo toVO(PlatCommande t) {
        if(t==null){
            return null;
        }
        else{
            PlatCommandeVo vo =new PlatCommandeVo();
            vo.setId(t.getId());
            vo.setRefPlat(t.getRefPlat());
            vo.setPrix(NumberUtil.toString(t.getPrix()));
            vo.setQuantite(NumberUtil.toString(t.getQuantite()));
           // vo.setCommandeVo(t.);
           // vo.setTypeSupplements(typeSupplements);
           return vo;
        }
    }


    
}
