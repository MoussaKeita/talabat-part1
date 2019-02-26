/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.converter;

import com.talabat1.talabat1.commun.NumberUtil;
import com.talabat1.talabat1.domain.bean.Paiement;
import com.talabat1.talabat1.domain.rest.vo.PaiementVo;

/**
 *
 * @author Keita Moussa
 */
public class PaiementConverter extends AbstractConverter<Paiement,PaiementVo>{

    @Override
    public Paiement toItem(PaiementVo vo) {
        if(vo==null){
            return null;
        }
        else{
            Paiement item = new Paiement();
            item.setId(vo.getId());
            item.setReference(vo.getReference());
            item.setDate_de_paiment(vo.getDate_de_paiment());
            item.setMontant(NumberUtil.toDouble(vo.getMontant()));
            item.setTypePaiement(new TypePaiementConverter().toItem(vo.getTypePaiementVo()));
            item.setCommande(new CommandeConverter().toItem(vo.getCommandeVo()));
            return item;
        }
    }

    @Override
    public PaiementVo toVO(Paiement item) {
        if(item==null){
            return null;
        }
    else{
    PaiementVo vo = new PaiementVo(); 
    vo.setId(item.getId());
    vo.setReference(item.getReference());
    vo.setDate_de_paiment(item.getDate_de_paiment());
    vo.setTypePaiementVo(new TypePaiementConverter().toVO(item.getTypePaiement()));
    vo.setMontant(NumberUtil.toString(item.getMontant()));
    vo.setCommandeVo(new CommandeConverter().toVO(item.getCommande()));
    return vo;
         }

     }
}