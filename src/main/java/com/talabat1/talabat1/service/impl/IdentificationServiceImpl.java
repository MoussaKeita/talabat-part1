/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.service.impl;

import com.talabat1.talabat1.bean.Client;
import com.talabat1.talabat1.dao.ClientDao;
import com.talabat1.talabat1.service.IdentificationService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wadie
 */
@Service
public class IdentificationServiceImpl implements IdentificationService {

    @Autowired
    private ClientDao clientDao;
    @Autowired
    Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ClientDao getClientDao() {
        return clientDao;
    }

    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public int verificationDeCNX(String log, String mdp, String mdpConf) {
        Client client = clientDao.findByLog(log);
        if (!mdp.equals(mdpConf)) {
            return 0;// mdp et mdp de confirmation ne sont pas identique //
        } else if (client.getLogin().equals(log)) {
            return -1;// le login existe deja dans la base de donnée
        } else {
            return 1;// si tout marche tres bien// 
        }
    }

    @Override
    public Client connection(String log, String mdp) {

        return client;
    }

    @Override
    public Client creer(Client c) {
        int res = verificationDeCNX(c.getLogin(), c.getPassword(), c.getPassword_Confirmmation());
        if (res == 0 || res == -1) {
            return null;
        } else {

            return clientDao.save(c);
        }
    }

}
