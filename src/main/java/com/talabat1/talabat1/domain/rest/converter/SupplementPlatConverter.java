/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.converter;

import com.talabat1.talabat1.commun.NumberUtil;
import com.talabat1.talabat1.domain.bean.Supplement;
import com.talabat1.talabat1.domain.bean.SupplementPlat;
import com.talabat1.talabat1.domain.rest.vo.SupplementPlatVo;

/**
 *
 * @author Keita Moussa
 */
public class SupplementPlatConverter extends AbstractConverter<SupplementPlat, SupplementPlatVo>{

    @Override
    public SupplementPlat toItem(SupplementPlatVo vo) {
    if(vo==null){
        return null;
    }
    else{
        SupplementPlat item = new SupplementPlat();
        item.setId(vo.getId());
        item.setLibelleSupp(vo.getLibelleSupp());
        item.setPrix(NumberUtil.toDouble(vo.getPrix()));
        item.setQuantite(NumberUtil.toDouble(vo.getQuantite()));
        item.setSupplement(new SupplementConverter().toItem(vo.getSupplementVo()));
        return item;
       }
    }

    @Override
    public SupplementPlatVo toVO(SupplementPlat item) {
       if(item==null){
           return null;
       }
       else{
           SupplementPlatVo vo = new SupplementPlatVo();
           vo.setId(item.getId());
           vo.setLibelleSupp(vo.getLibelleSupp());
           vo.setPrix(NumberUtil.toString(item.getPrix()));
           vo.setQuantite(NumberUtil.toString(item.getQuantite()));
           vo.setSupplementVo(new SupplementConverter().toVO(item.getSupplement()));
           return vo;
       }
    }
    
}
