/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.converter;

import com.talabat1.talabat1.commun.NumberUtil;
import com.talabat1.talabat1.domain.bean.Supplement;
import com.talabat1.talabat1.domain.rest.vo.SupplementVo;

/**
 *
 * @author Keita Moussa
 */
public class SupplementConverter extends AbstractConverter<Supplement, SupplementVo>{

    @Override
    public Supplement toItem(SupplementVo vo) {
        if(vo==null){
            return null;
        }
        else{
            Supplement item = new Supplement();
            item.setId(vo.getId());
            item.setLibelle(vo.getLibelle());
            item.setPlatCommande(new PlatCommandeConverter().toItem(vo.getPlatCommandeVo()));
            item.setTotal_Supp(NumberUtil.toDouble(vo.getTotal_Supp()));
            item.setType_Supp(vo.getType_Supp());
            item.setSupplementPlats(new SupplementPlatConverter().toItem(vo.getSupplementPlatVo()));
           return  item;
        }
    }

    @Override
    public SupplementVo toVO(Supplement item) {
    if(item==null){
        return null;
    }
    else{
        SupplementVo vo = new SupplementVo();
        vo.setId(item.getId());
        vo.setLibelle(item.getLibelle());
        vo.setType_Supp(item.getType_Supp());
        vo.setTotal_Supp(NumberUtil.toString(item.getTotal_Supp()));
        vo.setPlatCommandeVo(new PlatCommandeConverter().toVO(item.getPlatCommande()));
        vo.setSupplementPlatVo(new SupplementPlatConverter().toVo(item.getSupplementPlats()));
        return vo;
    }
    } 
}
