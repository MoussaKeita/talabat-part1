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
            
            Client item = new Client();
            item.setId(vo.getId());
            item.setNom(vo.getNom());
            item.setPrenom(vo.getPrenom());
            item.setAdresse(vo.getAdresse());
            item.setContact(NumberUtil.toDouble(vo.getContact()));
            item.setLogin(vo.getLogin());
            item.setPassword(vo.getPassword());
            item.setPassword_Confirmmation(vo.getPassword_Confirmmation());
            item.setCommandes(new CommandeConverter().toItem(vo.getCommandesVo()));
            return item;
        }
    }
    
    @Override
    public ClientVo toVO(Client item) {
        if(item==null){
            return null;
        }
    else{
          ClientVo vo = new ClientVo();
          vo.setId(item.getId());
          vo.setNom(item.getNom());
          vo.setPrenom(item.getPrenom());
          vo.setContact(NumberUtil.toString(item.getContact()));
          vo.setAdresse((item.getAdresse()));
          vo.setLogin(item.getLogin());
          vo.setPassword(item.getPassword());
          vo.setPassword_Confirmmation(item.getPassword_Confirmmation());
          vo.setCommandesVo(new CommandeConverter().toVo(item.getCommandes()));
        return vo;
     }
      
  }
}
    

