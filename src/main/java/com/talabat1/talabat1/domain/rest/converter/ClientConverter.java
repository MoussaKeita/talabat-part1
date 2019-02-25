/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.converter;

import com.talabat1.talabat1.domain.bean.Client;
import com.talabat1.talabat1.commun.NumberUtil;
import com.talabat1.talabat1.domain.rest.vo.ClientVo;

/**
 *
 * @author wadie
 */
public class ClientConverter extends AbstractConverter<Client, ClientVo> {
    
    @Override
    public Client toItem(ClientVo vo) {
        if (vo == null) {
            return null;
        } else {
            
            Client client = new Client();
            client.setId(vo.getId());
            client.setNom(vo.getNom());
            client.setPrenom(vo.getPrenom());
            client.setAdresse(vo.getAdresse());
            client.setContact(NumberUtil.toDouble(vo.getContact()));
            client.setLogin(vo.getLog());
            client.setPassword(vo.getPassword());
            client.setCommandes(new CommandeConverter().toItem(vo.getCommandesVo()));
            return client;
        }
    }
    
    @Override
    public ClientVo toVO(Client t) {
        return null;
    }
    
}
