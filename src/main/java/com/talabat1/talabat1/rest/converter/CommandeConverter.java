/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.rest.converter;

import com.talabat1.talabat1.bean.Commande;
import com.talabat1.talabat1.rest.vo.CommandeVo;
import java.util.List;

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
            Commande commande = new Commande();
            commande.setId(vo.getId());
            return commande;
        }
        
    }
    
    @Override
    public CommandeVo toVO(Commande t) {
        return null;
    }
    
}
