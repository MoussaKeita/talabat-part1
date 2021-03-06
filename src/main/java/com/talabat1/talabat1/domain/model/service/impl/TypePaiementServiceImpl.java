/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.service.impl;

import com.talabat1.talabat1.domain.bean.Paiement;
import com.talabat1.talabat1.domain.bean.TypePaiement;
import com.talabat1.talabat1.domain.model.dao.TypePaiementDao;
import com.talabat1.talabat1.domain.model.service.TypePaiementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wadie
 */
@Service
public class TypePaiementServiceImpl implements TypePaiementService {
@Autowired
private TypePaiementDao typePaiementDao;
 
    @Override
    public List<TypePaiement> findByLibelle(String libelle) {
        return typePaiementDao.findByLibelle(libelle);
    }
    public TypePaiementDao getTypePaiementDao() {
        return typePaiementDao;
    }

    public void setTypePaiementDao(TypePaiementDao typePaiementDao) {
        this.typePaiementDao = typePaiementDao;
    }

}
