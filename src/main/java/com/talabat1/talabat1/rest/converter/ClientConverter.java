/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.rest.converter;

import com.talabat1.talabat1.bean.Client;
import com.talabat1.talabat1.rest.vo.ClientVo;

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
            client.setAdresse(vo.getAdresse());
            client.setNom(vo.getNom());
            client.setPrenom(vo.getPrenom());
            client.setIdentification(vo.getIdentification()); //***//
           // client.setContact(tovo.getContact());
            return client;
        }
    }
    
    @Override
    public ClientVo toVO(Client t) {
        return null;
    }
    
}
