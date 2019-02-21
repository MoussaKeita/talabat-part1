/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.service.impl;

import com.talabat1.talabat1.bean.Supplement;
import com.talabat1.talabat1.bean.SupplementPlat;
import com.talabat1.talabat1.dao.SupplementPlatDao;
import com.talabat1.talabat1.service.SupplementPlatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
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
      return supplementPlatDao.findBySupplement(libelle);
    }

    @Override
    public int saveSupplementPlat(SupplementPlat supplementPlat) {
     List<SupplementPlat> supplementPlats = supplementPlat.get;
    }

    public SupplementPlatDao getSupplementPlatDao() {
        return supplementPlatDao;
    }

    public void setSupplementPlatDao(SupplementPlatDao supplementPlatDao) {
        this.supplementPlatDao = supplementPlatDao;
    }


    
}
