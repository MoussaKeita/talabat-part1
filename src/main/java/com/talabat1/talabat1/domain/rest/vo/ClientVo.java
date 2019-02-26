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
    private String nom;
    private String prenom;
    private String adresse;
    private String contact;
    private String login;
    private String password;
    private String password_Confirmmation;
    private List<CommandeVo> commandesVo;
    /*********************************************/
    // les getters et setters //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword_Confirmmation() {
        return password_Confirmmation;
    }

    public void setPassword_Confirmmation(String password_Confirmmation) {
        this.password_Confirmmation = password_Confirmmation;
    }

}
