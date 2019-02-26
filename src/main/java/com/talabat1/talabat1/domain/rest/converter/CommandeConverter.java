/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.converter;

import com.talabat1.talabat1.commun.NumberUtil;
import com.talabat1.talabat1.domain.bean.Commande;
import com.talabat1.talabat1.domain.rest.vo.CommandeVo;

/**
 *
 * @author wadie
 */
public class CommandeConverter extends AbstractConverter<Commande, CommandeVo> {
    
    @Override
    public Commande toItem(CommandeVo vo) {
        if (vo == null) {
            return null;
        } else {
            Commande item = new Commande();
            item.setId(vo.getId());
            item.setReference(vo.getReference());
            item.setTotal(NumberUtil.toDouble(vo.getTotal()));
            item.setTotalPaiement(NumberUtil.toDouble(vo.getTotalPaiement()));
            item.setDateCommande(vo.getDateCommande());
            item.setClient(new ClientConverter().toItem(vo.getClientVo()));
            item.setPaiement(new PaiementConverter().toItem(vo.getPaiementVo()));
            item.setPlatCommandes(new PlatCommandeConverter().toItem(vo.getPlatCommandesVo()));
            return item;
        }
        
    }
    
    @Override
    public CommandeVo toVO(Commande item) {
        if(item==null){
            return null;
        }
        else{
            CommandeVo vo = new CommandeVo();
           vo.setReference(item.getReference());
           vo.setId(item.getId());
           vo.setDateCommande(item.getDateCommande());
           vo.setTotal(NumberUtil.toString(item.getTotal()));
           vo.setTotalPaiement(NumberUtil.toString(item.getTotalPaiement()));
          vo.setPlatCommandesVo(new PlatCommandeConverter().toVo(item.getPlatCommandes()));
           return vo;
        }
    }
    
}
