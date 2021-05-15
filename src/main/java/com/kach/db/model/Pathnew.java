/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kach.db.model;

import com.kach.Calc.Calculate;
import com.kach.db.model.Map;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author misha
 */
@Entity
@Table(name="PATHNEW")
public class Pathnew {
    Pathnew(){
        
    }
    @Id
    @Column(name="PATHNEW_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    public void setid(Integer id){
        this.id=id;
    }
    public Integer getid(){
        return id;
    }
    public Pathnew(int x1,int y1,int x2,int y2, ArrayList<Map> map){
        this.path=Calculate.calculate_better(x1, y1, x2, y2, map);
    }
    @Column(name="PATHNEW_PATH")
    private ArrayList<Map> path;
    public ArrayList<Map> getpath(){
        return this.path;
    }
    public void setpath(ArrayList<Map> path){
        this.path=path;
    }
}
