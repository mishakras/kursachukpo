/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kach.db.model;

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
@Table(name="MAPNEW")
public class Mapnew {
    Mapnew(){
        
    }
    @Id
    @Column(name="MAPNEW_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    public void setid(Integer id){
        this.id=id;
    }
    public Integer getid(){
        return id;
    }
    public Mapnew(String NAME){
        this.NAME=NAME;
        this.MAP=new ArrayList <>();
    }
    @Column(name="MAPNEW_NAME")
    private String NAME;
    public String getNAME(){
        return this.NAME;
    }
    public void setx(String NAME){
        this.NAME=NAME;
    }
    @Column(name="MAPNEW_MAP")
    private ArrayList<Map> MAP;
    public ArrayList<Map> getMAP(){
        return this.MAP;
    }
    public void sety(ArrayList<Map> MAP){
        this.MAP=MAP;
    }
}
