/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.rest;

import com.talabat1.talabat1.bean.Client;
import com.talabat1.talabat1.service.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wadie
 */
@RestController
@RequestMapping("talabat1/clients")
public class ClientRest {

    @Autowired
    IdentificationService identificationService;

    public int verificationDeCNX(String log, String mdp, String mdpConf) {
        return identificationService.verificationDeCNX(log, mdp, mdpConf);
    }

    public Client connection(String log, String mdp) {
        return identificationService.connection(log, mdp);
    }

    public Client creer(Client c) {
        return identificationService.creer(c);
    }

}
