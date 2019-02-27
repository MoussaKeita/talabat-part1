/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.service.impl;

import com.talabat1.talabat1.domain.bean.Supplement;
import com.talabat1.talabat1.domain.bean.SupplementPlat;
import com.talabat1.talabat1.domain.model.dao.SupplementPlatDao;
import com.talabat1.talabat1.domain.model.service.SupplementPlatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Keita Moussa
 */
@Service
public class SupplementPlatServiceImpl implements SupplementPlatService {

    @Autowired
    private SupplementPlatDao supplementPlatDao;

    @Override
    public List<SupplementPlat> findBySupplement(String libelle) {
        return supplementPlatDao.findByLibelle(libelle);
    }

     @Override
    public int saveSupplementPlat(Supplement supplement) {
       List<SupplementPlat> supplementPlats = supplement.getSupplementPlats();
       if(supplementPlats !=null){
                  for(SupplementPlat supplementPlat : supplementPlats){
                 supplementPlat.setSupplement(supplement);//association du supplement avec la liste supplementPlat//
                 supplementPlatDao.save(supplement);
                     }
             }
       return 1;
    }
    public SupplementPlatDao getSupplementPlatDao() {
        return supplementPlatDao;
    }

    public void setSupplementPlatDao(SupplementPlatDao supplementPlatDao) {
        this.supplementPlatDao = supplementPlatDao;
    }

}
