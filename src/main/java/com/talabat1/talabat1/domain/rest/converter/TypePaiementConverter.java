/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.converter;

import com.talabat1.talabat1.domain.bean.TypePaiement;
import com.talabat1.talabat1.domain.rest.vo.TypePaiementVo;

/**
 *
 * @author Keita Moussa
 */
public class TypePaiementConverter extends AbstractConverter<TypePaiement, TypePaiementVo>{

    @Override
    public TypePaiement toItem(TypePaiementVo vo) {
      if(vo==null){
          return null;
      }
      else{
          TypePaiement item = new TypePaiement();
          item.setId(vo.getId());
          item.setLibelle(vo.getLibelle());
          item.setPaiements(new PaiementConverter().toItem(vo.getPaiementVo()));
          return item;
      }
    }

    @Override
    public TypePaiementVo toVO(TypePaiement item) {
       if(item==null){
           return null;
       }
       else{
           TypePaiementVo vo = new TypePaiementVo();
           vo.setId(item.getId());
           vo.setLibelle(item.getLibelle());
           vo.setPaiementVo(new PaiementConverter().toVo(item.getPaiements()));
           return vo;
       }
    }

}
