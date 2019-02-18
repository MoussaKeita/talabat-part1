/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.dao;

import com.talabat1.talabat1.bean.Client;
import com.talabat1.talabat1.bean.Identification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wadie
 */
@Repository
public interface IdentificationDao extends JpaRepository<Identification, Long>{
    public Client findClientByLog(String log);
    public Identification findLog(String log);  //permet de chercher si le log saisi est déja enregisté sur la BD,on utilise cette Methode dans la methode "vérification de cnx"//
}