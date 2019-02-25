/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest;

import com.talabat1.talabat1.domain.bean.Client;
import com.talabat1.talabat1.domain.model.service.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/newClient")
    public Client creer(@RequestBody Client c) {
        return identificationService.creer(c);
    }

    @GetMapping("/log/{log}/mdp/{mdp}/mdpConf/{mdpConf}")
    public int verificationDeCNX(@PathVariable String log, @PathVariable String mdp, @PathVariable String mdpConf) {
        return identificationService.verificationDeCNX(log, mdp, mdpConf);
    }

    @GetMapping("/log/{log}/mdp/{mdp}/")
    public Client connection(@PathVariable String log, @PathVariable String mdp) {
        return identificationService.connection(log, mdp);
    }

}