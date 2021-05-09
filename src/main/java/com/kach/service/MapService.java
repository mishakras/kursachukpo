package com.kach.service;
import com.kach.db.model.Map;


/**
 *
 * @author misha
 */
public interface MapService {
    Iterable<Map> listAll();
    Map add(Integer x,Integer y);
    public void delete(Integer id);
    public void deleteall();
}
