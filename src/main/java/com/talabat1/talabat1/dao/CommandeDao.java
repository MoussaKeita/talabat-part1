/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.dao;

import com.talabat1.talabat1.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Keita Moussa
 */
@Repository
public interface CommandeDao extends JpaRepository<Commande, Long> {
    public Commande findByReference(String reference);
}
