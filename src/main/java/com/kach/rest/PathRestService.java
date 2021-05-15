package com.kach.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kach.service.MapService;
import com.kach.service.PathService;


@RestController
@RequestMapping("/public/rest/path")
public class PathRestService {

    @Autowired
    private MapService mapService;
    @Autowired
    private PathService pathService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Object> browse() {
        return ResponseEntity.ok(pathService.listAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        pathService.delete(id);
    }

    @RequestMapping(value = "/{x1}/{y1}/{x2}/{y2}", method = RequestMethod.POST)
    public ResponseEntity<Object> add(@PathVariable("x1") Integer x1, @PathVariable("y1") Integer y1,@PathVariable("x2") Integer x2, @PathVariable("y2") Integer y2) {
        System.out.print(x1);
        return ResponseEntity.ok(pathService.add(x1,y1,x2,y2,mapService.listAll()));
    }
}

