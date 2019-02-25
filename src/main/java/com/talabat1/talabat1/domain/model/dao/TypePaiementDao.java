/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.dao;

import com.talabat1.talabat1.domain.bean.Paiement;
import com.talabat1.talabat1.domain.bean.TypePaiement;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wadie
 */
@Repository
public interface TypePaiementDao extends JpaRepository<TypePaiement, Long> {
public List<TypePaiement> findByLibelle(String libelle);
}
