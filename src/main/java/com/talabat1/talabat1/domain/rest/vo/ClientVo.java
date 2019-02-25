/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.rest.vo;

import java.util.List;

/**
 *
 * @author wadie
 */
public class ClientVo {

    private Long id;
    private String Log;
    private String nom;
    private String prenom;
    private String adresse;
    private String contact;
    private String password;
    private List<CommandeVo> commandesVo;

    // les getters et setters //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLog() {
        return Log;
    }

    public void setLog(String Log) {
        this.Log = Log;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<CommandeVo> getCommandesVo() {
        return commandesVo;
    }

    public void setCommandesVo(List<CommandeVo> commandesVo) {
        this.commandesVo = commandesVo;
    }

}
