package com.kach.service;

import com.kach.db.model.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kach.db.dao.MapRepository;


@Service
public class MapServiceImpl implements MapService{
    @Autowired
    private MapRepository MapRepository;
    @Override
    public Iterable<Map> listAll() {
        return  MapRepository.findAll();
    }
    @Override
    public Map add(Integer x, Integer y) {
        return MapRepository.save(new Map(x,y));
    }
    
    @Override
    public void delete(Integer id) {
        MapRepository.delete(id);
    }
    @Override
    public void deleteall(){
        MapRepository.deleteAll();
    }
}
