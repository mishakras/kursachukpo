/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kach.service;

import com.kach.db.model.Map;
import com.kach.db.model.Mapnew;
import org.springframework.beans.factory.annotation.Autowired;

public class NewMapServiceImpl implements NewMapService {

    @Autowired
    private Mapnew mapnew;
    
    @Override
    public String Get() {
        return mapnew.getNAME();
    }

    @Override
    public Map add(Integer x, Integer y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer x, Integer y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
