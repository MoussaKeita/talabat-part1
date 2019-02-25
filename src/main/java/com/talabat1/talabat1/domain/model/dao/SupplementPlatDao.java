/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.dao;

import com.talabat1.talabat1.domain.bean.Supplement;
import com.talabat1.talabat1.domain.bean.SupplementPlat;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Keita Moussa
 */
@Repository
public interface SupplementPlatDao extends JpaRepository<Supplement,Long>{
    public List<SupplementPlat> findBySupplement(String libelle);
}
