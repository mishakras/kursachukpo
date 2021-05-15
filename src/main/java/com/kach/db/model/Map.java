package com.kach.db.model;

import java.io.Serializable;
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
@Table(name="MAP")
public class Map {

    Map(){
        
    }
    @Id
    @Column(name="MAP_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    public void setid(Integer id){
        this.id=id;
    }
    public Integer getid(){
        return id;
    }
    public Map(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Column(name="MAP_X")
    private Integer x;
    public int getx(){
        return this.x;
    }
    public void setx(int x){
        this.x=x;
    }
    @Column(name="MAP_Y")
    private Integer y;
    public int gety(){
        return this.y;
    }
    public void sety(int y){
        this.y=y;
    }
}
