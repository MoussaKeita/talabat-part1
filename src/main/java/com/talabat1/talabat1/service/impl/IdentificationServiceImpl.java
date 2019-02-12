/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.service.impl;

import com.talabat1.talabat1.bean.Client;
import com.talabat1.talabat1.bean.Identification;
import com.talabat1.talabat1.dao.IdentificationDao;
import com.talabat1.talabat1.service.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wadie
 */
@Service
public class IdentificationServiceImpl implements IdentificationService {

    @Autowired
    private IdentificationDao identificationDao;

    @Override
    public int verificationDeCNX(String log) {
        Identification identification = identificationDao.findLog(log);

        // je dois créer le cas du mot de passe different du mdp confi//
        if (identification != null) {
            return -1;
        } else {
            return 1;
        }

    }

    @Override
    public Client connection(String log, String mdp) {
        Identification identification = identificationDao.findLog(log);
        if (!identification.getMdp().equals(mdp) || !identification.equals(log)) {
            return null;
        } else {
            return identificationDao.findClientByLog(log);
        }

    }

}
