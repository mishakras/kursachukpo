package com.kach.service;

import com.kach.db.dao.PathRepository;
import com.kach.db.model.Map;
import com.kach.db.model.Path;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PathServiceImpl implements PathService {

    @Autowired
    private PathRepository PathRepository;
    @Override
    public Iterable<Path> listAll() {
        return  PathRepository.findAll();
    }

    @Override
    public Path add(Integer x1, Integer y1,Integer x2, Integer y2,Iterable<Map> map) {
        ArrayList<Map> temp=new ArrayList<>();
        map.forEach(temp::add);
        return PathRepository.save(new Path(x1,y1,x2,y2,temp));
    }

    @Override
    public void delete(Integer id) {
        PathRepository.delete(id);
    }
    
}

