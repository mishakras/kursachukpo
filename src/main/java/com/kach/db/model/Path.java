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
@Table(name="PATH")
public class Path {
    Path(){
        
    }
    @Id
    @Column(name="PATH_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    public void setid(Integer id){
        this.id=id;
    }
    public Integer getid(){
        return id;
    }
    public Path(int x1,int y1,int x2,int y2, ArrayList<Map> map){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.path=Calculate.calculate(x1, y1, x2, y2, map);
    }
    @Column(name="PATH_X1")
    private Integer x1;
    public int getx1(){
        return this.x1;
    }
    public void setx1(int x){
        this.x1=x;
    }
    @Column(name="PATH_Y1")
    private Integer y1;
    public int gety1(){
        return this.y1;
    }
    public void sety1(int y){
        this.y1=y;
    }
    @Column(name="PATH_X2")
    private Integer x2;
    public int getx2(){
        return this.x2;
    }
    public void setx2(int x){
        this.x2=x;
    }
    @Column(name="PATH_Y2")
    private Integer y2;
    public int gety2(){
        return this.y2;
    }
    public void sety2(int y){
        this.y2=y;
    }
    @Column(name="PATH_PATH")
    private String path;
    public String getpath(){
        return this.path;
    }
    public void setpath(String path){
        this.path=path;
    }
}
