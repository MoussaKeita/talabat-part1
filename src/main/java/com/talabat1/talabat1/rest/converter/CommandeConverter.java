/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.rest.converter;

import com.talabat1.talabat1.bean.Commande;
import com.talabat1.talabat1.rest.vo.CommandeVo;

/**
 *
 * @author wadie
 */
public class CommandeConverter implements AbstractConverter<Commande,CommandeVo>{

    @Override
    public Commande toItem(CommandeVo vo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CommandeVo toVO(Commande t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
