/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author wadie
 */
@Entity
public class Identification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String mdp;  // mot de passe //
    private String mdpConf;  // mot de passe de confirmation //
    private String test;

    // les constructeur // 
    public Identification() {
    }

    public Identification(Long id, String login, String mdp, String mdpConf) {
        this.id = id;
        this.login = login;
        this.mdp = mdp;
        this.mdpConf = mdpConf;
    }

    // getters et setters // 
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getMdpConf() {
        return mdpConf;
    }

    public void setMdpConf(String mdpConf) {
        this.mdpConf = mdpConf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Identification)) {
            return false;
        }
        Identification other = (Identification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Identification{" + "id=" + id + ", login=" + login + ", mdp=" + mdp + ", mdpConf=" + mdpConf + '}';
    }

}
