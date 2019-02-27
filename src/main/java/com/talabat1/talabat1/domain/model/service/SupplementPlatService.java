/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.domain.model.service;

import com.talabat1.talabat1.domain.bean.Supplement;
import com.talabat1.talabat1.domain.bean.SupplementPlat;
import java.util.List;

/**
 *
 * @author Keita Moussa
 */
public interface SupplementPlatService {
    public List<SupplementPlat> findBySupplement(String libelle);
   public Supplement saveSupplementPlat (Supplement supplement);
}
