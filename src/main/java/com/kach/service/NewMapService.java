package com.kach.service;
import com.kach.db.model.Mapnew;
import com.kach.db.model.Map;

/**
 *
 * @author misha
 */
public interface NewMapService {
    String  Get();
    Map add(Integer x,Integer y);
    public void delete(Integer x, Integer y);
    public void deleteall();
}
