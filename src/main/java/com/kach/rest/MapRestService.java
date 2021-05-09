package com.kach.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kach.service.MapService;


@RestController
@RequestMapping("/public/rest/map")
public class MapRestService {

    @Autowired
    private MapService mapService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Object> browse() {
        return ResponseEntity.ok(mapService.listAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        mapService.delete(id);
    }
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public void deleteall() {
        mapService.deleteall();
    }

    @RequestMapping(value = "/{x}/{y}", method = RequestMethod.POST)
    public ResponseEntity<Object> add(@PathVariable("x") Integer x, @PathVariable("y") Integer y) { 
        return ResponseEntity.ok(mapService.add(x, y));
    }
}
