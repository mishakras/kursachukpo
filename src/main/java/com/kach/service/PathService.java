package com.kach.service;
import com.kach.db.model.Map;
import java.util.ArrayList;
import com.kach.db.model.Path;
/**
 *
 * @author misha
 */
public interface PathService {
    Iterable<Path> listAll();
    Path add(Integer x1, Integer y1,Integer x2, Integer y2,Iterable<Map> map);
    public void delete(Integer id);
}
