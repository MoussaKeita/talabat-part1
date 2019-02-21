/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.service.impl;

import com.talabat1.talabat1.bean.Client;
import com.talabat1.talabat1.dao.ClientDao;
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
            return 0;
        } else if (client.getLogin().equals(log)) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public Client connection(String log, String mdp) {
        // int res = verificationDeCNX(log);
        // if(res==)
        return client;
    }

}
