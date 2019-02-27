/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest;

import com.talabat1.talabat1.domain.bean.Client;
import com.talabat1.talabat1.domain.model.service.IdentificationService;
import com.talabat1.talabat1.domain.rest.converter.ClientConverter;
import com.talabat1.talabat1.domain.rest.vo.ClientVo;
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
@RequestMapping("/talabat1/clients")
public class ClientRest {

    @Autowired
    IdentificationService identificationService;

    @PostMapping("/")
    public ClientVo creer(@RequestBody ClientVo clientVo) {
        ClientConverter clientConverter = new ClientConverter();
        Client clientItem = clientConverter.toItem(clientVo);
        Client client = identificationService.creer(clientItem);
        return clientConverter.toVO(client);
    }

    @GetMapping("/log/{log}/mdp/{mdp}/mdpConf/{mdpConf}")
    public int verificationDeCNX(@PathVariable String log, @PathVariable String mdp, @PathVariable String mdpConf) {
        return identificationService.verificationDeCNX(log, mdp, mdpConf);
    }

    @GetMapping("/log/{log}/mdp/{mdp}/")
    public ClientVo connection(@PathVariable String log, @PathVariable String mdp) {

        return new ClientConverter().toVO(identificationService.connection(log, mdp));
    }

}
